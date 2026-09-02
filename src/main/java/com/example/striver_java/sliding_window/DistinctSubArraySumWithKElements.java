package com.example.striver_java.sliding_window;


import java.util.HashSet;

public class DistinctSubArraySumWithKElements {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        int maxSum = 0;

        int left = 0;
        for(int right=0;right<n;right++){
            while (set.contains(nums[right])){
                sum-=nums[left];
                set.remove(nums[left]);
                left++;
            }

            sum+=nums[right];
            set.add(nums[right]);

            if(right -left +1 == k){
                maxSum = Math.max(sum,maxSum);
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

        }

        return maxSum;
    }
}
