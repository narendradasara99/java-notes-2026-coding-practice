package com.example.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ScoreCard {
	@Scheduled(fixedRate = 3000)
	public void sco() {
		WebClient.create().get().uri("http://localhost:8080/get").retrieve().bodyToMono(String.class).subscribe(System.out::println);

	}
	
}
