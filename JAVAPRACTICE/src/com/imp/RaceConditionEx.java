package com.imp;

public class RaceConditionEx {

	int i = 0;

	public synchronized void inc() {
		i++;
	}

	public static void main(String[] args) throws InterruptedException {
		RaceConditionEx r = new RaceConditionEx();

		Thread thread = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				r.inc();
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				r.inc();
			}
		});
		thread.start();
		thread2.start();
		thread.join();
		thread2.join();

		System.out.println(r.i);
	}

}
