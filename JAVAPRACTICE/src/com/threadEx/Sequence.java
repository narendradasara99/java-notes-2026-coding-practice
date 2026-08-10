package com.threadEx;

public class Sequence {
	private int number = 1;

	public synchronized void print(int remainder) {
		while (number <= 99) {
			if (number % 3 == remainder) {
				System.out.println(Thread.currentThread().getName() + " " + number++);
				notifyAll();
			} else {
				try {
					wait();
				} catch (Exception e) {
				}
			}
		}
	}

	public static void main(String[] args) {
		Sequence s = new Sequence();

		new Thread(() -> s.print(1), "T1").start();
		new Thread(() -> s.print(2), "T2").start();
		new Thread(() -> s.print(0), "T3").start();

	}

}
