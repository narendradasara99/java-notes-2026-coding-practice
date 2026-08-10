package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @KafkaListener(topics = "order-created", groupId = "payment-group-new")
    public void process(Oreders order) {

        if (Math.random() > 0.5) {
            System.out.println("Payment Success: " + order.getId());
            kafkaTemplate.send("payment-success", order);
        } else {
            System.out.println("Payment Failed: " + order.getId());
            kafkaTemplate.send("payment-failed", order);
        }
    }
}