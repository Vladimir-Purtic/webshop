package com.goodgame.controller;

import com.goodgame.service.MousePadService;
import com.goodgame.service.WebCamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebCamController {

    private final WebCamService service;

    @Autowired
    public WebCamController(final WebCamService service){
        this.service = service;
    }

    @GetMapping("/webcams")
    public ModelAndView allKeyboards(){
        return getKeyboardsModelAndView("webcams");
    }

    @GetMapping("webcam-item/{id}")
    public ModelAndView mouse(@PathVariable int id){
        return getSpecificWebCam("webcam-item", id);
    }

    @GetMapping("/webcam-item/purchase-form/{id}")
    public ModelAndView purchaseForm(@PathVariable int id){
        return purchaseForm("purchase-form", id);
    }

    @GetMapping("/webcam-item/purchase-form/{id}/order/{id}")
    public ModelAndView order(@PathVariable int id){
        return orderWebCam("order", id);
    }

    private ModelAndView getKeyboardsModelAndView(String viewName){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("webcams", service.getWebCams());
        return modelAndView;
    }

    private ModelAndView getSpecificWebCam(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("webcam", service.getWebCam(id));
        return modelAndView;
    }

    private ModelAndView purchaseForm(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("purchase", service.getWebCam(id));
        return modelAndView;
    }

    private ModelAndView orderWebCam(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("purchase", service.orderWebCam(id));
        return modelAndView;
    }
}
