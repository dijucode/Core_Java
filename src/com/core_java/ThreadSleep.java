package com.core_java;

public class ThreadSleep implements Runnable {

    @Override
    public void run()
    {
        System.out.println("Run Method Started by "+ Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        ThreadSleep ts = new ThreadSleep();
        Thread t1 = new Thread(ts);
        Thread t2 = new Thread(ts);
        Thread t3 = new Thread(ts);
        t3.start();
        t1.start();
        t2.start();
        t1.setName("Thread1");
        t2.setName("Thread2");
        t3.setName("Thread3");
        t1.setPriority(1);
        t2.setPriority(5);
        t3.setPriority(10 );


    }
}

