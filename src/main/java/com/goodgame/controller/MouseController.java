package com.goodgame.controller;

import com.goodgame.service.MouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class MouseController {

    private final MouseService service;

    @Autowired
    public MouseController(final MouseService service){
        this.service = service;
    }

    @GetMapping("/mouses")
    public ModelAndView allMouses(){
        return getMousesModelAndView("mouses");
    }

    @GetMapping("mouse-item/{id}")
    public ModelAndView mouse(@PathVariable int id){
        return getSpecificMouse("mouse-item", id);
    }

    @GetMapping("/mouse-item/purchase-form/{id}")
    public ModelAndView purchaseForm(@PathVariable int id){
        return purchaseForm("purchase-form", id);
    }

    @GetMapping("/mouse-item/purchase-form/{id}/order/{id}")
    public ModelAndView order(@PathVariable int id){
        return orderMouse("order", id);
    }

    private ModelAndView getMousesModelAndView(String viewName){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("mouses", service.getMouses());
        return modelAndView;
    }

    private ModelAndView getSpecificMouse(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("mouse", service.getMouse(id));
        return modelAndView;
    }

    private ModelAndView purchaseForm(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("purchase", service.getMouse(id));
        return modelAndView;
    }

    private ModelAndView orderMouse(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("purchase", service.orderMouse(id));
        return modelAndView;
    }
}
