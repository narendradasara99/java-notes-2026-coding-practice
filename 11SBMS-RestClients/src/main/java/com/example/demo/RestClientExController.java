package com.example.demo;

import org.jspecify.annotations.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class RestClientExController {
	
	@GetMapping("/get")
	public String get() {
		String s = "http://localhost:8080/greet";
		RestTemplate rt = new RestTemplate();
		ResponseEntity<String> forEntity = rt.getForEntity(s, String.class);
		return forEntity.getBody();
	}

	@GetMapping("/get1")
	public String getweb() {
		String s = "http://localhost:8080/greet";

		WebClient webClient = WebClient.create();
		@Nullable
		String block = webClient.get().uri(s).retrieve().bodyToMono(String.class).block();
		return block;
	}

}
