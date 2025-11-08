package com.example.collections;

import java.util.HashMap;


public class HashMapMethod {
    public static void main(String[] args) {
        hashmapMethod();

    }
    static void hashmapMethod(){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        map.put(1,2);
        map.put(2,3);
        map.put(3,4);
        map.put(4,5);
        map.put(5,6);


        for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

//        containsKey(key)	Check key
//        containsValue(value)	Check value
//        remove(key)	Remove key
//        size()	Number of entries
//        isEmpty()	Check empty
//        keySet()	Get set of keys
//        values()	Get collection of values
//        entrySet()	Iterate key-value pair
    }
}
