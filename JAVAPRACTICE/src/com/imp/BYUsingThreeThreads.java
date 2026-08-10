package com.imp;

public class BYUsingThreeThreads {

	int n = 1;

	public synchronized void print(int rem) {
		while (n < 100) {
			if (n % 3 == rem) {
				System.out.println(Thread.currentThread().getName() + "  " + n++);
				notifyAll();
			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		BYUsingThreeThreads b = new BYUsingThreeThreads();

		new Thread(() -> b.print(1)).start();
		new Thread(() -> b.print(2)).start();
		new Thread(() -> b.print(0)).start();

	}

}
