package com.COMPLETABLEFUTURE;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyTask extends Thread {

	public void run() {
		
			System.out.println(Thread.currentThread().getName());
		
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
	
		ExecutorService executor = Executors.newFixedThreadPool(3);

		Future<String> dbFuture = executor.submit(() -> {
		    Thread.sleep(2000);
		    System.out.println("DB Saved");
		    return "DB";
		});

		Future<String> paymentFuture = executor.submit(() -> {
		    Thread.sleep(2000);
		    System.out.println("Payment Done");
		    return "Payment";
		});

		Future<String> notificationFuture = executor.submit(() -> {
		    Thread.sleep(2000);
		    System.out.println("Notification Sent");
		    return "Notification";
		});

		System.out.println("Waiting for DB...");
		String db = dbFuture.get();      // Blocks

		System.out.println("Waiting for Payment...");
		String payment = paymentFuture.get(); // Blocks

		System.out.println("Waiting for Notification...");
		String notification = notificationFuture.get(); // Blocks

		System.out.println("Completed");
		
	}

}
