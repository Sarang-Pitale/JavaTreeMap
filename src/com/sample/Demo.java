package com.sample;

import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        TreeMap<Integer, String> num = new TreeMap<>(); // creation
        num.put(3, "three");// add element
        num.put(1, "One");
        num.put(2, "two");
        //num.put(null,"abc"); // null key not allowed
        num.putIfAbsent(3, "Three"); // add if key not exist
        System.out.println("Map :" + num);
        System.out.println(num.get(2)); // get element with key 2
        System.out.println(num.keySet());// get all keys
        System.out.println(num.values()); // get all values
    }
}
