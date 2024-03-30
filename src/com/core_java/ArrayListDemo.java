package com.core_java;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List l = new ArrayList(10);
        l.add(100);
        l.add(200);
        l.add(300);
        l.add(400);
        l.add(500);
        System.out.println(l.get(2));
        List l2 = new ArrayList();
        l2.add(5656);
        l2.addAll(l);
        System.out.println(l2);
        l2.retainAll(l);
        System.out.println(l2);

    }
}
