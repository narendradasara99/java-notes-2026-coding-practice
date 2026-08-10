package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository repo;

    @KafkaListener(topics = "payment-success", groupId = "inventory-group")
    public void updateStock(Oreders order) {

        Inventory inv = new Inventory();
        inv.setProduct(order.getProduct());
        inv.setQuantity(1);

        repo.save(inv);

        System.out.println("📦 Inventory updated for Order: " + order.getId());
    }
}