package com.example.striver_java.sliding_window;


import java.util.HashMap;
public class FruitsOnBaskets {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int n = fruits.length;
        int maxLen = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int right=0;right<n;right++){
            map.put(fruits[right], map.getOrDefault(fruits[right],0)+1);

            while(map.size() > 2){
                map.put(fruits[left],map.get(fruits[left]) -1);
                if(map.get(fruits[left] ) == 0){
                    map.remove(fruits[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen,right-left+1);
        }

        return maxLen;
    }
}
