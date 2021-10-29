package com.dong;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class HashMapTest {
    public static void main(String[] args) {


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"zhangsan");
        map.put(2,"lisi");
        map.put(3,"wangwu");
        Set<Integer> ke = map.keySet();

        Iterator<Integer> iterator1 = ke.iterator();
        while(iterator1.hasNext()){


            Integer key = iterator1.next();
            System.out.println(key);
            System.out.println(map.get(key));


        }

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Map.Entry<Integer, String> m: set
        ){
            System.out.println(m);

        }

    }
}
