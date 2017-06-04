package com.efjava.demo1;

import java.util.WeakHashMap;

/**
 * Created by user on 17-6-3.
 */
public class NutriionFacts {



    private final  int serviceSize = 0;

    private final int servings = 0;

    private final int calories = 0;

    WeakHashMap map = new WeakHashMap();

    public static void main(String[] args) {
        NutriionFacts nf = new NutriionFacts();
        nf.map.put("aaa", "bbb");
        nf.map.get("aaa");
    }




}
