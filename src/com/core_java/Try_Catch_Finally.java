package com.core_java;
public class Try_Catch_Finally{
    public static void main(String[] args) {
        System.out.println("main method started");
        try{
            System.out.println("In try block");
//            int i = 10 / 0;
        }catch(Exception e)
            {
                System.out.println("Catch Block");
                e.printStackTrace();
            }
    finally

            {
                System.out.println("in finally block");
            }
        System.out.println("main method ended");
        }
    }

