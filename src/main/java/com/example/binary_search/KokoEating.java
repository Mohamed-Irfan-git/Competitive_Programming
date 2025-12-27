package com.example.binary_search;

import java.util.Arrays;

public class KokoEating {
    public static void main(String[] args) {
        int [] arr = {25, 12, 8, 14, 19};
        int hour = 5;
        System.out.println(eating(arr,hour));
        System.out.println(eating(arr,hour));


    }
    static int eating(int [] nums , int hour){
        int max = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }

        int low = 1;
        int high = max;
        int ans = -1;
        while (low <= high){
            int mid =low + (high-low)/2;
            if(bananas(nums,mid) <= hour){
                ans =mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }


        }
        return ans;
    }


    static int bananas(int [] arr , int banana){
        double total = 0;
        for (int i = 0 ; i < arr.length; i++){
            total += Math.ceil((double) arr[i]/(double) banana);
        }

        return (int)total;
    }
}
