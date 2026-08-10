package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Public API";
    }

    @GetMapping("/user")
    public String user() {
        return "User API";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin API";
    }
    @GetMapping("/manager")
    public String manager() {
        return "Manager API";
    }

}
