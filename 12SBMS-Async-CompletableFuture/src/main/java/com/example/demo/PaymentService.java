package com.example.demo;

import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Async
public class PaymentService {
	
	
	public CompletableFuture<String> getPayment() {

	    try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    return CompletableFuture.completedFuture("Success");
	}

}
