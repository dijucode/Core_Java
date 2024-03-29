package com.core_java;

public class Demo2 {
    static int m1(){
        try{return 0;}
        finally{
            System.out.println("inside finally Block");
        }
    }
    public static void main(String[] args)throws ClassNotFoundException {
        String s = null;
        m1();
        System.out.println(s);
//        if(true){
//            throw new ClassNotFoundException();
//        }
        System.out.println("Hi there");
    }
}
