package com.example.basicspringsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCard{

    @RequestMapping("/card")
    public String myCard(){
        return "This is my card page";
    }
}
