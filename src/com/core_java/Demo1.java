package com.core_java;

public class Demo1 {
    int a=26, b=13, c = 224;

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        try {
            d1.b = 0;

            d1.a = 0;
            d1.c = d1.a / d1.b;
            System.out.println(d1.a);
            System.out.println(d1.c);
            System.out.println("A");

        } catch (ArithmeticException e) {
            System.out.println(e);
        }

    }
}