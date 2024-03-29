package com.core_java;

public class TryCatchDemo {
    public static void main(String[] args) {
         try{
             System.out.println("try block started");
             String str = null;
             System.out.println(str.length());
             System.out.println("try block Ended");
         }
         catch(Exception e){
            System.out.println("In catch block ");
             e.printStackTrace();
        };

        System.out.println("Main Method Ended");
    }
}
