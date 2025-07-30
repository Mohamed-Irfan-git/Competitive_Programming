package com.example.sliding_window;

public class LongestSum {
    public static void main(String[] args) {

    }
    public static int win(int[] nums, int k) {
        int len = nums.length;
        int right = 0;
        int left = 0;

        int sum = 0;
        for(left = 0; left < len; left++){
            sum += nums[left];

           while (sum<k){
               right++;
               sum += nums[right];
           }
        }
        return right - left;

    }
}
