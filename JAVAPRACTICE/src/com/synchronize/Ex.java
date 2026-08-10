package com.synchronize;

public class Ex {

	int count = 0;

	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) throws InterruptedException {
		Ex ex = new Ex();
		Runnable t=()->{
			for(int i=0;i<1000;i++) {

				ex.increment();
			}
		};
		
	Thread thread = new Thread(t);
	Thread thread1 = new Thread(t);

	thread.start();
	thread1.start();
	thread.join();
	thread1.join();
	

	
	System.out.println(ex.count);

	}
}
