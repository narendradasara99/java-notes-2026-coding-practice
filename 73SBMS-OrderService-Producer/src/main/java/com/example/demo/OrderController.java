package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OdderProducer producer;

    @PostMapping("/order")
    public String createOrder(@RequestBody Order order) {

        producer.send(order);

        return "Order Published Successfully";
    }
    @GetMapping("/get")
    public Order get() {

        Order order = new Order(1, "TV", 9000d);

        return order;
        		
    }
}