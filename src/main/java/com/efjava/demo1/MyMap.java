package com.efjava.demo1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 17-6-3.
 */
public class MyMap {


    public static  <K,V> HashMap<K, V> newInstance() {


        return new HashMap<K, V>();
    }


    public static void main(String[] args) {

        HashMap<String, String> objectObjectHashMap = MyMap.newInstance();
        objectObjectHashMap.put("aaa", "bbb");
        String aaa = objectObjectHashMap.get("aaa");
        System.out.println(aaa);
    }
}
