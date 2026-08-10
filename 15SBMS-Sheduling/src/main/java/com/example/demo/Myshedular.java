package com.example.demo;

import java.time.Instant;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Myshedular {

	@Scheduled(fixedDelay  = 5000) // every 5 seconds
	public void runTask() {
		System.out.println(
				"Task executed at: " + System.currentTimeMillis() + " | MyScheduler hashcode: " + this.hashCode());
	}
	@Scheduled(cron = "0 0/1 * * * ?") // every 1 minute
	public void task() {
		System.out.println("task"+Instant.now()+""+this.hashCode());
	}
}
