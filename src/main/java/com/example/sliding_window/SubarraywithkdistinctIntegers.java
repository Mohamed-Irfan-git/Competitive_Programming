package com.example.sliding_window;

import java.util.HashMap;

public class SubarraywithkdistinctIntegers {
    int subarraysWithKDistinct(int [] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }

    int helper(int [] nums,int k){
        int n = nums.length;
        int left = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int right =0;right<n;right++){
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size() > k){
               map.put(nums[left] , map.get(nums[left])-1);
               if(map.get(nums[left]) == 0){
                   map.remove(nums[left]);
               }

               left++;
            }
            count += right - left + 1;
        }
        return count;

    }

    public static void main(String[] args) {
        SubarraywithkdistinctIntegers sun = new SubarraywithkdistinctIntegers();
        int [] nums = {1,2,1,3,4};
        int k = 3;
        System.out.println(sun.subarraysWithKDistinct(nums,k));
    }
}
