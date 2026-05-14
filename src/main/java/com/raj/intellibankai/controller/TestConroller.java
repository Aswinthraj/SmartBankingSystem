package com.raj.intellibankai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestConroller {

    @GetMapping("/")
    public String home(){
        return "Intelli AI backend Running";
    }
}
