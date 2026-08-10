package com.threadEx;

public class Counter {

	public int c = 0;

	public synchronized void inc() {
		c++;
	}

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.inc();
			}
		});
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.inc();
			}
		});

		thread.start();
		thread1.start();
		thread.join();

		thread1.join();
		
		System.out.println(counter.c);
	}

}
