package com.example.bitmanipulation.hard;

import java.util.ArrayList;

/**
 * here you can see i used left shift and AND operator
 * this is the recursion question
 * time complexity is no diff compare to the recursion space complexity less then recursion
 * in this case duplicate value also working no need to sort
 */

public class Subsets {
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        subset(arr);
    }
    public static void subset(int[] arr){
        int n = arr.length;
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        for(int i = 0; i < 1<<n; i++){
            ArrayList<Integer> inner = new ArrayList<>();
            for(int j = 0; j < n; j++){
                if((i&(1<<j))!=0){
                    inner.add(arr[j]);
                }
            }
            outer.add(inner);
        }
        System.out.println(outer);
    }
}
