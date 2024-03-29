package com.core_java;
class NoSuchIdException extends RuntimeException{
    public NoSuchIdException(String s){
        super(s);

    }
}

public class ThrowDemo {
    public static void getName(int i) throws Exception{
        if (i == 101) {
            System.out.println("Raju");
        } else if (i == 202) {
            System.out.println("Ramu");

        } else {
            throw new NoSuchIdException("wrong id given");
        }

    }
    public static void main(String[] args) throws Throwable {
        ThrowDemo.getName(2002);

    }
}