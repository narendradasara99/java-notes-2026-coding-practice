package com.COMPLETABLEFUTURE;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.concurrent.CompletableFuture;

public class AsyncCFEx {

	public static CompletableFuture<String> geCustomer() {

		return CompletableFuture.supplyAsync(() -> {
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Customer API Thread: " + Thread.currentThread().getName());
			return "customer:3";
		});

	}

	public static CompletableFuture<String> getOrders() {

		return CompletableFuture.supplyAsync(() -> {
			
			System.out.println("Order API Thread: " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "Orders:76";
		});

	}

	public static void main(String[] args) {
		
		Instant now = Instant.now();

		CompletableFuture<String> thenCombine = getOrders().thenCombine(geCustomer(), (g, h) -> g + " " + h);
		thenCombine.thenAccept(s -> System.out.println(s));
		
		CompletableFuture<Void> allOf = CompletableFuture.allOf(getOrders(),geCustomer());

		 allOf.join();
		thenCombine.join();
		Instant now2 = Instant.now();
		
		Duration between = Duration.between(now, now2);
		System.out.println(between.toMillis());
	}

}
