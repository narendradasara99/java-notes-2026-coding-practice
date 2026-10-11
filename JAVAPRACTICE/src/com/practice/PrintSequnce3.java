package com.practice;

public class PrintSequnce3 {

	int n = 1;

	public synchronized void sequnce(int remainder) {

		while (n <= 100) {
			if (n % 2 == remainder) {
				System.out.println(Thread.currentThread().getName() + " " + n++);
				notifyAll();
			} try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		PrintSequnce3 s = new PrintSequnce3();

        new Thread(() -> s.sequnce(1), "T1").start();
        
        new Thread(() -> s.sequnce(0), "T2").start();

	}

}
