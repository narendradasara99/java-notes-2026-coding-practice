package com.synchronize;



class Race{

    int count=0;

    public synchronized void inc(){
        count++;
    }

    public static void main(String args[]) throws InterruptedException{
        Race r=new Race();

       Runnable run=()->{
        for(int i=1;i<=1000;i++){
            r.inc();
        }
       };

    Thread t1=new Thread(run);
    Thread t2=new Thread(run);
    t1.start();
    t2.start();
    t1.join();
    t2.join();
    System.out.println(r.count);

    





    }
}
