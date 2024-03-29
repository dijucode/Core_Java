package com.core_java;

public class FactorialDemo {
    public static int factorial(int n){
        if (n==0){
            return (1);

        }
        if (n==1){
            return (1);

        }
        else{
            return n * factorial(10);
        }
    }
    public static void main(String[] args) {
        System.out.print(factorial(0));

    }



}

