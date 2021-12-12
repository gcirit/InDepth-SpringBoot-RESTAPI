package com.gcirit.Springboot.tutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Returns ResponseBody
public class HelloController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Welcome to Spring Boot Tutorial!";
    }
}
