package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Scheduled(fixedRate = 5000)
	@Async
	public void asyncTask() {
	    System.out.println("Async task hashcode: " + this.hashCode() + " Thread: " + Thread.currentThread().getName());
	}


}
