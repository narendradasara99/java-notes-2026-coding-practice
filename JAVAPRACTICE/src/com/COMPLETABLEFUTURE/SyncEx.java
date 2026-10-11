package com.COMPLETABLEFUTURE;

import java.time.Duration;
import java.time.Instant;

public class SyncEx {
	public static String getCustomer() {

		System.out.println("Customer API Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Customer:3";
	}

	public static String getOrders() {

		System.out.println("Order API Thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Orders:76";
	}

	public static void main(String[] args) {

		Instant start = Instant.now();

		String orders = getOrders();

		String customer = getCustomer();

		String result = orders + " " + customer;

		System.out.println(result);

		Instant end = Instant.now();

		Duration between = Duration.between(start, end);

		System.out.println(between.toMillis() + " ms");
	}
}
