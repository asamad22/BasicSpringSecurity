package com.example.basicspringsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Notice {

    @RequestMapping("/notice")
    public String notice(){
        return "This is notice page";
    }
}
