package com.synchronize;

public class InterThread {

	int x = 1;
	int max = 100;

	public synchronized void printEvent() throws InterruptedException {
		while (x < max) {
			if (x % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + "even" + x++);
				notify();
			} else {
				wait();
			}
		}

	}

	public synchronized void printOdd() throws InterruptedException {
		while (x < max) {
			if (x % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + "odd" + x++);
				notify();
			} else {
				wait();
			}
		}

	}

	public static void main(String[] args) {
		
		InterThread i = new InterThread();
		
		new Thread(()->{
			try {
				i.printEvent();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();
		new Thread(()->{
			try {
				i.printOdd();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}).start();

	}
}
