package com.threadEx;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test6 {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    queue.put(i);
                    System.out.println("Produced: " + i);
                } catch (Exception e) {}
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    System.out.println("Consumed: " + queue.take());
                } catch (Exception e) {}
            }
        });

        producer.start();
        consumer.start();
    }

}
