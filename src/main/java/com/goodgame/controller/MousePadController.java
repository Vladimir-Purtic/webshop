package com.goodgame.controller;

import com.goodgame.service.MousePadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MousePadController {

    private final MousePadService service;

    @Autowired
    public MousePadController(final MousePadService service){
        this.service = service;
    }

    @GetMapping("/mousepads")
    public ModelAndView allKeyboards(){
        return getKeyboardsModelAndView("mousepads");
    }

    @GetMapping("mousepad-item/{id}")
    public ModelAndView mouse(@PathVariable int id){
        return getSpecificMousePad("mousepad-item", id);
    }

    @GetMapping("/mousepad-item/purchase-form/{id}")
    public ModelAndView purchaseForm(@PathVariable int id){
        return purchaseForm("purchase-form", id);
    }

    @GetMapping("/mousepad-item/purchase-form/{id}/order/{id}")
    public ModelAndView order(@PathVariable int id){
        return orderMousePad("order", id);
    }

    private ModelAndView getKeyboardsModelAndView(String viewName){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("mousepads", service.getMousePads());
        return modelAndView;
    }

    private ModelAndView getSpecificMousePad(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("mousepad", service.getMousePad(id));
        return modelAndView;
    }

    private ModelAndView purchaseForm(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("purchase", service.getMousePad(id));
        return modelAndView;
    }

    private ModelAndView orderMousePad(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("purchase", service.orderMousePad(id));
        return modelAndView;
    }
}
