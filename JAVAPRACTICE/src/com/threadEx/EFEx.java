package com.threadEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EFEx {

	public static void main(String[] args) {

		ExecutorService e = Executors.newFixedThreadPool(3);

		for (int i = 0; i < 100; i++) {

			int t = i;
			e.submit(() -> {
				System.out.println(Thread.currentThread().getName() + "task" + t);
			});

		}
e.shutdown();
	}

}
