package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethod {
    public static void main(String[] args) {
        arrayListMethod();
    }
    static void arrayListMethod(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,10);

        System.out.println(list.get(3)); // get that index in value
        list.set(3,6);
        System.out.println(list.get(3));
        System.out.println(list);

        list.remove(3);
        System.out.println(list.get(3));
        System.out.println(list.contains(4));// if it is return true
        System.out.println(list.indexOf(4)); // if it is return that index it is search front to end
        System.out.println(list.lastIndexOf(5)); // search from last but give that index from first

        Collections.sort(list); // it will sort that list ascending order
        Collections.reverse(list); // this reverse that array

        list.sort(Collections.reverseOrder()); // this will sort reverse order
        Collections.shuffle(list); // shuffle the element

        Collections.max(list); //min
        Collections.min(list); //max

        list.toArray(); //this convert list to array



    }

}
