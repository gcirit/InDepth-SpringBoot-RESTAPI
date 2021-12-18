package com.gcirit.Springboot.tutorial.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Returns ResponseBody
public class HelloController {

    @Value("${welcome.message}")
    private  String welcomeMessage;

    @GetMapping("/")
    public String HelloWorld(){
        return welcomeMessage;
    }
}
