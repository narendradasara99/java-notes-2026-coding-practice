package com.imp;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CreateThread extends Thread  {
	
	@Override
	public void run() {
		System.out.println("run method");
	}
	
	public static void main(String[] args) {
		CreateThread c = new CreateThread();
		c.start();
		
		
		ExecutorService e = Executors.newFixedThreadPool(MAX_PRIORITY);
		e.submit(()->System.out.println("executors way"));
	}
	
	
	

}
