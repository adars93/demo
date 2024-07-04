package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AyushController {
    @GetMapping("/ayush")
    public String helloFromAyush() {
        System.out.println("helloFromAyush() called ...");
        return "Hello from Ayush!!";
    }
}
