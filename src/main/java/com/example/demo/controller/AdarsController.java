package com.example.demo.controller;




import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdarsController {

    @GetMapping("/helloAdars")
    public String sayHello() {
        return "Hello Adars";
    }
}
