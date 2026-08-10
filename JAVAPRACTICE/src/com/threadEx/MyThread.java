package com.threadEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyThread {
	private int number = 1;
	private final int MAX = 100;

	public synchronized void printEven() throws InterruptedException {
		while (number <= MAX) {
			if (number % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + " " + number++);
				notify();
			} else {
				wait();
			}
		}
	}

	public synchronized void printOdd() throws InterruptedException {
		while (number <= MAX) {
			if (number % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + " " + number++);
				notify();
			} else {
				wait();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();

		new Thread(() -> {
			try {
				myThread.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		new Thread(() -> {
			try {
				myThread.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();

	}
}
