package com.example.sliding_window;

import java.util.HashMap;

public class MinimumSubArraySum {
    public int minSubArrayLen(int target, int[] nums){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int sum = 0;
        int minLen =  Integer.MAX_VALUE;

        for(int right = 0;right < n;right++){
            sum +=nums[right];

            while(sum >= target){
                minLen = Math.min(right-left+1,minLen);
                sum -=nums[left];
                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE) return 0;
        return minLen;

    }
}
