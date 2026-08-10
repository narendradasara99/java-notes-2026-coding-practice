package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Orders;
import com.example.demo.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repo;

    @Autowired
    private OrderProducer producer;

    public void create(Orders order){

        repo.save(order);

        producer.send(order);

    }

}
