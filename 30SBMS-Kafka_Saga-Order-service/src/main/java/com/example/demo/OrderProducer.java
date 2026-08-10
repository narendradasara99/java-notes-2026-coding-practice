package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
	
	@Autowired
	private KafkaTemplate<String , Object> kt;
	
	public void send(Oreders o) {
		kt.send("order-created",o);
		System.out.println("order-produced");
	}
	
	

}
