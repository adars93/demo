package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArjunCotroller {
    @GetMapping("/helloArjun")
    public String sayHello() {
        return "Hello from Arjun";
    }
}
