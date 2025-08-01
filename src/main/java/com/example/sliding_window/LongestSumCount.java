package com.example.sliding_window;

public class LongestSumCount {
    public static void main(String[] args) {
        int [] arr = {10,15,18,12,14,13,15,12};
        System.out.println(maxSumCount(arr,4));

    }
    public static int maxSumCount(int[] arr,int k){
        int len = arr.length;

        int maxSum =0;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        maxSum = sum;
        for(int i=k;i<len;i++){
            sum =arr[i]+sum-arr[i-k];

            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;

    }
}
