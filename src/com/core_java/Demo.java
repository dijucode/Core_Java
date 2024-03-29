package com.core_java;

import java.util.concurrent.atomic.AtomicInteger;
class Demo{
    public static void main(String[] args) {


        AtomicInteger atomicInteger = new AtomicInteger(10);

        atomicInteger.incrementAndGet();
        System.out.println(atomicInteger);
}
}