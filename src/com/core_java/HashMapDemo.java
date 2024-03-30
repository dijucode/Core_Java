package com.core_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "orange");
        map.put(4, "grape");
        map.put(5, "pineapple");
        map.put(6, "strawberry");
        Set<Map.Entry<Integer, String>> c = map.entrySet();
        System.out.println(c);
        for(Map.Entry<Integer, String> e : c){
            Integer i = e.getKey();
            String v = e.getValue();
            System.out.println("key = "+ i + "      value = "+ v);
        }

    }

}
