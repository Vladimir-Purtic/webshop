package com.goodgame.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ResourceController {

    @RequestMapping(value = {"", "/", "/home"})
    public String home(){
        return "home";
    }
}
