package com.example.striver_java.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        //extrem brute force force we can go with 2 nested for loop
        int n = numbers.length;
//        for(int i =0;i<n-1;i++){
//            for(int j= i+1;j<n;j++){
//                if(target == numbers[i] + numbers[j]){
//                    return new int[]{i, j};
//                }
//            }
//        }
//
//        return new int[]{};


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(numbers[i],i);
        }

        for(int i = 0;i<n;i++){
            int rem = target - numbers[i];
            if(map.containsKey(rem)){
                return new int[]{i+1,map.get(rem)};
            }

        }
       

        return new int[]{};
    }
}
