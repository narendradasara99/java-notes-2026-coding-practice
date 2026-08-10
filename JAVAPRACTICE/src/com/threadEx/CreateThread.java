package com.threadEx;

public class CreateThread extends Thread {
	
	@Override
	public void run() {
		synchronized (this) {
		System.out.println("run method");
		for(int i=0;i<100;i++) {
			System.out.println(currentThread().getName());
		}}
		
	}
	
public static void main(String[] args) {
	System.out.println("main");
	System.out.println("Thread"+currentThread().getName());

	
	CreateThread createThread = new CreateThread();
	CreateThread createThread1 = new CreateThread();
	CreateThread createThread2 = new CreateThread();

	createThread.start();
	createThread2.start();
	createThread.start();

}

}
