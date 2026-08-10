package com.imp;

public class PrintEvenOdd {

	int start = 1;
	int max = 100;

	public synchronized void printEven() throws InterruptedException {
		while (start <= max) {

			if (start % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + "  " + start++);
				notify();
			}
			wait();

		}
	}

	public synchronized void printOdd() throws InterruptedException {
		while (start <= max) {

			if (start % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + "  " + start++);
				notify();
			}
			wait();
		}
	}

	public static void main(String[] args) {
		PrintEvenOdd p = new PrintEvenOdd();

		new Thread(() -> {
			try {
				p.printEven();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}).start();
		new Thread(() -> {
			try {
				p.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();

	}
}
