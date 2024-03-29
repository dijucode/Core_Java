package com.core_java;

public class Calculator {
    public static int add(String s, int ... a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }



public static void main(String[] args) {
    System.out.println(add("Sum", 3, 3, 4, 7));


}
}