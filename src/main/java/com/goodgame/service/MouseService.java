package com.goodgame.service;

import com.goodgame.dto.MouseDTO;
import com.goodgame.model.Mouse;
import com.goodgame.repository.MouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MouseService {

    private final MouseRepo repo;

    @Autowired
    public MouseService(final MouseRepo repo){
        this.repo = repo;
    }

    public List<MouseDTO> getMouses(){
        List<Mouse> mouseList = repo.findAll();
        List<MouseDTO> mouseDTOList = new ArrayList<>();
        MouseDTO dto;
        for (Mouse mouse : mouseList){
            dto = new MouseDTO(mouse);
            mouseDTOList.add(dto);
        }
        return mouseDTOList;
    }

    public MouseDTO orderMouse(int id){
        Mouse mouse = repo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Mouse with id %s not found", id)));
        mouse.setQuantity(mouse.getQuantity()-1);
        repo.save(mouse);
        MouseDTO dto = new MouseDTO(mouse);
        return dto;
    }

    public MouseDTO getMouse(int id){
        Mouse mouse = repo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Mouse with id %s not found", id)));
        MouseDTO dto = new MouseDTO(mouse);
        return dto;
    }
}
