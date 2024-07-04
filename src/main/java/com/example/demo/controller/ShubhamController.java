package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShubhamController {
    @GetMapping("/helloshubham")
    public String sayHello() {
        return "Hello from Shubham";
    }
}
