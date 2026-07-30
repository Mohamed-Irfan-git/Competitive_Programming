package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>  list= new ArrayList<>(List.of(10,52,1,6,4,8,1));
//        Collections.sort(list); // sorting the list
//        Collections.reverse(list); reversing the list
        int fre = Collections.frequency(list,1);
        System.out.println(fre);
    }
}
