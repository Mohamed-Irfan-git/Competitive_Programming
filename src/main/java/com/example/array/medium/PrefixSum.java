package com.example.array.medium;

import java.util.HashMap;

public class PrefixSum {
    public static void main(String[] args) {
        int [] arr = {-3, 2, 1};
        longestSubArray(arr,6);

    }

    public static void longestSubArray(int [] arr , int k){
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int longest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if(prefixSum == k){
                longest = Math.max(i+1,longest);
            }

            if(map.containsKey(prefixSum-k)){
                longest = Math.max(longest,i-map.get(prefixSum-k));
            }

            if(!map.containsKey(prefixSum)){
                map.put(prefixSum,i);
            }
        }

        System.out.println(longest);
    }
}
