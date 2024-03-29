

package com.core_java;

import java.io.*;

class Person implements Serializable {
    int age;
    String name;
}

public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person();
        p.age = 20;
        p.name = "Raju";
        System.out.println("Serialization Started....");

        // Serialization
        FileOutputStream fos = new FileOutputStream("PersonRecord.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.close();

        System.out.println("Serialization closed...");
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("Deserialization started...");

        // Deserialization
        FileInputStream fis = new FileInputStream("PersonRecord.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p1 = (Person) ois.readObject();
        ois.close();

        System.out.println(p1.age);
        System.out.println(p1.name);
        System.out.println("Deserialization Ended..............");
    }
}
