package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
	@Autowired
	public KafkaProducerService kp;

	@Autowired
	public KafkaConsumerService kc;

	@GetMapping("/send")
	public String send(@RequestParam String msg) {
		kp.sendMessge(msg);
		return "Message sent";
	}

	
}
