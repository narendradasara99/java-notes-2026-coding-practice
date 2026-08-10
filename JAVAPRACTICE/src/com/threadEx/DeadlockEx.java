package com.threadEx;

public class DeadlockEx {
	
	
	public static Object l1=new Object();

	public static Object l2=new Object();
	
	
	public static void main(String[] args) {
		
		
		Thread t1 = new Thread(()->{
			synchronized (l1) {
				System.out.println("T1 lock1");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (l2) {
					System.out.println("T1 lock2");

				}
				
			}
		});
		Thread t2 = new Thread(()->{
			synchronized (l1) {
				System.out.println("T2 lock1");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (l2) {
					System.out.println("T2 lock2");

				}
				
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
