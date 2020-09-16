package com.goodgame.service;

import com.goodgame.dto.MousePadDTO;
import com.goodgame.dto.WebCamDTO;
import com.goodgame.model.MousePad;
import com.goodgame.model.WebCam;
import com.goodgame.repository.WebCamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class WebCamService {

    private final WebCamRepo repo;

    @Autowired
    public WebCamService(final WebCamRepo repo){
        this.repo = repo;
    }

    public List<WebCamDTO> getWebCams(){
        List<WebCam> webCamList = repo.findAll();
        List<WebCamDTO> webCamDTOList = new ArrayList<>();
        WebCamDTO dto;
        for (WebCam webCam : webCamList){
            dto = new WebCamDTO(webCam);
            webCamDTOList.add(dto);
        }
        return webCamDTOList;
    }

    public WebCamDTO getWebCam(int id){
        WebCam webCam = repo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Web Cam with id %s not found", id)));
        WebCamDTO dto = new WebCamDTO(webCam);
        return dto;
    }

    public WebCamDTO orderWebCam(int id){
        WebCam webCam = repo.findById(id).orElseThrow(() -> new RuntimeException(String.format("Web Cam with id %s not found", id)));
        webCam.setQuantity(webCam.getQuantity()-1);
        repo.save(webCam);
        WebCamDTO dto = new WebCamDTO(webCam);
        return dto;
    }

}
