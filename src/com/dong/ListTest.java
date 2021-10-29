package com.dong;

import java.util.*;

public class ListTest {
    public static void main(String[] args) {

//        List l = new ArrayList<>();
//        Collection l = new HashSet<>();
        Set l = new HashSet<>();
        l.add(1);
//        l.add(2);
        l.add(2);
//        l.add(1);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(100);
        Iterator iterator = l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(l.isEmpty());
        Object[] arr = l.toArray();
        for (int i = 0; i < arr.length; i++) {
            Integer integer = (Integer) arr[i];
            System.out.println(integer);

        }


    }
}
