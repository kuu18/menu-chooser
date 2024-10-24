package com.example.kubo.daichi.menuchooser.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @GetMapping("/api/v1/hello")
    public String getHello() {
        return "HelloWorld!!!!";
    }
}