package com.core_java;

public class SumDemo {
    public static int sum(int n){
        if (n==0){
            return (0);
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.print(sum(10));

        }



    }


