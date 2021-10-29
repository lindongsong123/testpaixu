package com.dong.io;

import com.dong.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SeriableTest {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student("li", 1);
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("test.txt"));
        oos.writeObject(s1);
        oos.flush();
        oos.close();
    }
}
