package com.goodgame.controller;

import com.goodgame.service.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class KeyboardController {

    private final KeyboardService service;

    @Autowired
    public KeyboardController(final KeyboardService service){
        this.service = service;
    }

    @GetMapping("/keyboards")
    public ModelAndView allKeyboards(){
        return getKeyboards("keyboards");
    }

    @GetMapping("keyboard-item/{id}")
    public ModelAndView keyboard(@PathVariable int id){
        return getSpecificKeyboard("keyboard-item", id);
    }

    @GetMapping("/keyboard-item/purchase-form/{id}")
    public ModelAndView purchaseForm(@PathVariable int id){
        return purchaseForm("purchase-form", id);
    }

    @GetMapping("/keyboard-item/purchase-form/{id}/order/{id}")
    public ModelAndView order(@PathVariable int id){
        return orderKeyboard("order", id);
    }

    private ModelAndView getKeyboards(String viewName){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("keyboards", service.getKeyboards());
        return modelAndView;
    }

    private ModelAndView getSpecificKeyboard(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("keyboard", service.getKeyboard(id));
        return modelAndView;
    }

    private ModelAndView purchaseForm(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("purchase", service.getKeyboard(id));
        return modelAndView;
    }

    private ModelAndView orderKeyboard(String viewName, int id){
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("purchase", service.orderKeyboard(id));
        return modelAndView;
    }
}
