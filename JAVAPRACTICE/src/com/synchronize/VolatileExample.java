package com.synchronize;
public class VolatileExample {

    private  boolean stop = false;

    public void startTask() {

        Thread t = new Thread(() -> {

            while (!stop) {
                // Doing some work
            	System.out.println("running");
            }

            System.out.println("Thread stopped");
        });

        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        stop = true;

        System.out.println("Main thread set stop = true");
    }

    public static void main(String[] args) {

        VolatileExample obj = new VolatileExample();

        obj.startTask();
    }
}