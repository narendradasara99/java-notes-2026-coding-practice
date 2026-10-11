package com.practice;

import java.util.concurrent.ArrayBlockingQueue;

import com.imp.BlockingQueueEx;

public class ProducerConsumerBockingQueue {
	
	public static void main(String[] args) {
		ArrayBlockingQueue<Integer> q = new ArrayBlockingQueue<>(5);
		
		
		new Thread(()->{
			for(int i=1;i<=10;i++) {
				try {
					q.put(i);
					System.out.println("produced"+i);

				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
		new Thread(()->{
			for(int i=1;i<=10;i++) {
				
				try {
					System.out.println("Consumer"+q.take());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}).start();
	}

}
