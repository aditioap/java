package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
    @RequestMapping("/")
    public String hello() {
        return "Hello World - Aditio";
    }

}
