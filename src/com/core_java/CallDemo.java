package com.core_java;

import java.util.concurrent.*;

public class CallDemo implements Callable {

    @Override
    public Object call() throws Exception {
        System.out.println("Call method is being executed");
        return "hi";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallDemo d = new CallDemo();
        ExecutorService es = Executors.newFixedThreadPool(5);
        for(int i = 1; i<= 20; i++){
            es.submit(d);


        }es.shutdown();
    }
}
