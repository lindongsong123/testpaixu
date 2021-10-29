package com.dong;

import java.util.*;

public class ComparableTest {
    public static void main(String[] args) {
        HashSet<Student> list = new HashSet<>();
        list.add(new Student("lin",12));
        list.add(new Student("sd",11));
        list.add(new Student("ds",1));
        list.add(new Student("aa",2));
        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
