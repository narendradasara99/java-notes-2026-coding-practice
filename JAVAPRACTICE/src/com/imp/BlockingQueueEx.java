package com.imp;

import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueEx {
	
	public static void main(String[] args) {
		ArrayBlockingQueue<Object> a = new ArrayBlockingQueue<>(1);
		
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				try {
					a.put(i);
					System.out.println("produced "+i);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(()->{
			for (int i = 0; i < 10; i++) {
				try {
					Object take = a.take();
					System.out.println("produced "+take);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

}
