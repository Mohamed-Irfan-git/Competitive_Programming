package com.example.dyanamic_programming;

import java.util.HashMap;

public class Jump {
    public static void main(String[] args) {
        int [] arr = {2,3,1,1,4};
        System.out.println(jump(arr));

    }
    public static int jump(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        return  helper2(nums,0,nums.length,map);
    }
    public static int helper2(int[] nums,int start,int end,HashMap<Integer,Integer> map) {
        if(start>=end-1){
            return 0;
        }

        if (map.containsKey(start)) {
            return map.get(start);
        }

       int min = Integer.MAX_VALUE;
        for(int i=1;i<=nums[start];i++){
            int next = start+i;

            if(next<end){
                int jumps = helper2(nums, next, end, map);
                if(jumps != Integer.MAX_VALUE){
                    min = Math.min(min, 1 + jumps);
                }
            }
        }
        map.put(start,min);
        return min;
    }
}
