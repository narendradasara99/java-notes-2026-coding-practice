package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/order")
    public Oreders create(@RequestParam String product) {
        return service.create(product);
    }
}
