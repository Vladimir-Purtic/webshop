package com.goodgame.service;

import com.goodgame.dto.KeyboardDTO;
import com.goodgame.model.Keyboard;
import com.goodgame.repository.KeyboardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KeyboardService {

    private final KeyboardRepo repo;

    @Autowired
    public KeyboardService(final KeyboardRepo repo){
        this.repo = repo;
    }

    public List<KeyboardDTO> getKeyboards(){
        List<Keyboard> keyboardList = repo.findAll();
        List<KeyboardDTO> keyboardDTOList = new ArrayList<>();
        KeyboardDTO dto;
        for (Keyboard keyboard : keyboardList){
            dto = new KeyboardDTO(keyboard);
            keyboardDTOList.add(dto);
        }
        return keyboardDTOList;
    }

    public KeyboardDTO getKeyboard(int id){
        Keyboard keyboard = repo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Keyboard with id %s not found", id)));
        KeyboardDTO dto = new KeyboardDTO(keyboard);
        return dto;
    }

    public KeyboardDTO orderKeyboard(int id){
        Keyboard keyboard = repo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Keyboard with id %s not found", id)));
        keyboard.setQuantity(keyboard.getQuantity()-1);
        repo.save(keyboard);
        KeyboardDTO dto = new KeyboardDTO(keyboard);
        return dto;
    }
}
