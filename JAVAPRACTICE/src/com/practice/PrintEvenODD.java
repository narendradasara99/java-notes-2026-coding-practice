package com.practice;

public class PrintEvenODD {

	int start = 1;
	int end = 100;

	public synchronized void printeven() {

		while (start < end) {

			if (start % 2 == 0) {
				System.out.println(Thread.currentThread().getName()  +"  =" + start++);
				notify();

			}
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public synchronized void printOdd() {

		while (start < end) {

			if (start % 2 != 0) {
				System.out.println(Thread.currentThread().getName()  +"  =" + start++);
				notify();

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
		PrintEvenODD p = new PrintEvenODD();
		
		new Thread(()->{
			p.printeven();
		}).start();
		
		new Thread(()->{
			p.printOdd();
		}).start();

	}
}
