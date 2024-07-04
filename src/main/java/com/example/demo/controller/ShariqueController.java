package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShariqueController {
    @GetMapping("/hellosharique")
    public String sayHello() {
        return "Hello, I am Sharique Ahmad";
    }
}
