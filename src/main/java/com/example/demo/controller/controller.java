package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/login")
    public String log(){
        return "welcome to login page";
    }

    @GetMapping("/demo")
    public String demoo(){
        return "demo page";
    }


}
