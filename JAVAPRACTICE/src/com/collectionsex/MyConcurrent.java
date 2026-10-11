package com.collectionsex;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MyConcurrent {

	public static void main(String[] args) throws InterruptedException {

		//ConcurrentHashMap<Integer, String> c = new ConcurrentHashMap<>();
		HashMap<Integer, String> c = new HashMap<>();
		
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				c.put(i, "user" + i);

			}

		});
		Thread t2 = new Thread(() -> {
			for (int i = 1000; i < 2000; i++) {
				c.put(i, "user" + i);

			}

		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.println(c);

		System.out.println(c.size());

	}
}
