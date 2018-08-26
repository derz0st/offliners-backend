package com.offliners.authservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @GetMapping("/api")
    public String helloWorld() {
        return "Hello, world!";
    }

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Get without OAuth!";
    }
    
}
