package com.example.basicspringsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyBalance {

    @RequestMapping("/balance")
    public String myBalance(){
        return "This is my balance page";
    }
}
