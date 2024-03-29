package com.core_java;

import java.io.File;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        File f1 = new File("abc.txt");
        f1.createNewFile();
        File f2 = new File("xyz");
        f2.mkdir();
        File f3 = new File(f2, "abc.txt");
        f3.createNewFile();

    }
}
