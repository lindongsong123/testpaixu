package com.dong.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class UnSeriableTest {
    public static void main(String[] args) throws Exception {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("test.txt"));
        Object o = ois.readObject();
        System.out.println(o);
        ois.close();
    }
}
