package com.example.math;

import java.util.ArrayList;
import java.util.Collections;

public class Divisor {
    public static void main(String[] args) {
        divisor(36);

    }
    public static void divisor(int n) {
        ArrayList <Integer>list = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n%i==0){
                if(i==n/i){
                    list.add(i);
                }else{
                    list.add(n/i);
                    list.add(i);
                }


            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
