package com.offliners.authservice.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;

@RestController
public class AuthController {
    
    @GetMapping("/api")
    public String helloWorld() {
        return "Hello, world!";
    }

    @RequestMapping("/api/authorization/facebook")
    public Principal user(OAuth2Authentication principal) {
        return principal;
    }
    
    @RequestMapping("/api/user/name")
    public String userData(OAuth2Authentication principal) {
        Authentication userAuthentication = principal.getUserAuthentication();
        LinkedHashMap<String, String> userDetails = 
                (LinkedHashMap<String, String>) userAuthentication.getDetails();
        
        return String.format("%s: %s", userDetails.get("id"), userDetails.get("name"));
    }
    

    @GetMapping("/public")
    public String publicEndpoint() {
        return "Get without OAuth!";
    }
    
}
