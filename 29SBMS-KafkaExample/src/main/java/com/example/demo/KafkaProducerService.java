package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	@Autowired
	public KafkaTemplate<String, String> kt;
	
	public void sendMessge(String msg) {
		kt.send("test-topic",msg);
        System.out.println("Sent: " + msg);

	}

}
