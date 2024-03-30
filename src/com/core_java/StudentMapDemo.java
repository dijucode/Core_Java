package com.core_java;

import java.util.HashMap;
import java.util.Map;

class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id + "  " + name;
    }
}

public class StudentMapDemo {
    public static void main(String[] args) {
        Student s1 = new Student(101, "John");
        Student s2 = new Student(102, "Smith");
        Student s3 = new Student(103, "Brian");
        Map< Integer, Student> map = new HashMap<>();
        map.put(1, s1);
        map.put(2, s2);
        map.put(3, s3);
        System.out.println(map);
    }
}
