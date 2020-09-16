package com.goodgame.service;

import com.goodgame.dto.KeyboardDTO;
import com.goodgame.dto.MousePadDTO;
import com.goodgame.model.Keyboard;
import com.goodgame.model.MousePad;
import com.goodgame.repository.MousePadRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MousePadService {

    private final MousePadRepo repo;

    @Autowired
    public MousePadService(final MousePadRepo repo){
        this.repo = repo;
    }

    public List<MousePadDTO> getMousePads(){
        List<MousePad> mousePadList = repo.findAll();
        List<MousePadDTO> mousePadDTOList = new ArrayList<>();
        MousePadDTO dto;
        for (MousePad mousePad : mousePadList){
            dto = new MousePadDTO(mousePad);
            mousePadDTOList.add(dto);
        }
        return mousePadDTOList;
    }

    public MousePadDTO getMousePad(int id){
        MousePad mousePad = repo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Mouse Pad with id %s not found", id)));
        MousePadDTO dto = new MousePadDTO(mousePad);
        return dto;
    }

    public MousePadDTO orderMousePad(int id){
        MousePad mousePad = repo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Mouse Pad with id %s not found", id)));
        mousePad.setQuantity(mousePad.getQuantity()-1);
        repo.save(mousePad);
        MousePadDTO dto = new MousePadDTO(mousePad);
        return dto;
    }
}
