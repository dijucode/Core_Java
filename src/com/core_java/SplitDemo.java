package com.core_java;

import java.util.Arrays;
import java.util.List;

public class SplitDemo {
    public static void main(String[] args) {
        String s = "Hi My name is Ajay";

        int cnt = 0;
        for (char c: s.toCharArray()){
            cnt += 1;
        }
        System.out.println(cnt);
        String[] l = s.split(" ");
        System.out.println(Arrays.toString(l));
        System.out.println(l.length);
    }
}
// Also counting char in array