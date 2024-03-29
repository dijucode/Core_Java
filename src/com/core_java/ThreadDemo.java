package com.core_java;





class Demo3 extends Thread{
    Demo3(){    System.out.println("in Demo3 class");

}
}

public class ThreadDemo extends Thread{
    public void run(){
        System.out.println("I'm in Run method of Thread class");
    }
    public static void main(String[] args) {


        System.out.println("main method started");
        Demo3 d = new Demo3();
        Thread t = new Thread(d);
        t.start();
        System.out.println("Main Thread Ended");

    }
}
