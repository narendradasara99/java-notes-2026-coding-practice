package com.example.demo;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Home Page";
    }

    @GetMapping("/user")
    public String user(Authentication authentication) {

        return "Logged in user: "
                + authentication.getName();
    }
}