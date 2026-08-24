package com.example.striver_java.stack_queue;

public class TrappingRainWater {
    public int trap(int[] height){
        int n = height.length;
        int total = 0;

        int [] prefixMax = new int[n];
        int [] suffixMax = new int[n];

        prefixMax[0] = height[0];
        suffixMax[n-1] = height[n-1];

        for (int i=1;i<n;i++){
            prefixMax[i] = Math.max(height[i],prefixMax[i-1]);
        }

        for(int i=n-2;i>=0;i--){
            suffixMax[i] = Math.max(height[i],suffixMax[i+1]);
        }

        for(int i=0;i<n;i++){
            int rightMax = prefixMax[i];
            int leftMax = suffixMax[i];
            if(height[i] < rightMax && height[i] < leftMax){
                total += Math.min(rightMax,leftMax) -height[i];
            }
        }

        return total;
    }
}
