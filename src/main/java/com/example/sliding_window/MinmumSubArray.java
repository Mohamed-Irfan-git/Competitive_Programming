package com.example.sliding_window;

import java.util.PriorityQueue;

public class MinmumSubArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(minSubArray(11,arr));

    }
    public static int minSubArrayLen(int target, int[] nums) {
       int len =  nums.length;
       PriorityQueue<Integer> pq = new PriorityQueue<>();
        int sum=0;
        int count=0;

       for(int i=0;i<len;i++){
           sum+=nums[i];
           if(nums[i]==target){
               return 1;
           }
           for  (int j=i+1;j<len;j++){
               sum+=nums[j];
               if(sum<=target){
                   count++;
               }
               if(sum==target){
                   pq.offer(count+1);
               }
           }

           sum=0;
           count=0;

       }

       if(pq.isEmpty()){
           return 0;
       }
       return pq.poll();

    }

    public static int minSubArray(int target, int[] nums) {
        int left = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
