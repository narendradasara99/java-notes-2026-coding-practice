package com.synchronize;

class FlagExample {
    private volatile boolean running = true;

    public void stop() {
        running = false;
    }

    public void run() {
        while (running) { // always sees latest value
            System.out.println("Thread is running");
        }
        System.out.println("Thread stopped");
    }

    public static void main(String[] args) throws InterruptedException {
        FlagExample task = new FlagExample();

        Thread t = new Thread(() -> task.run());
        t.start();

        Thread.sleep(1000);
        task.stop(); // volatile ensures t sees the change immediately
    }
}

