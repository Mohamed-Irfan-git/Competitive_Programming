package com.example.search;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int [] arr ={5,7,7,8,8,8,9,10};
        int lower = lower_bound(arr,8);
        int upper = upper_bound(arr,8)-1;

        int [] arr1 = new int[2];
        arr1[0]=lower;
        arr1[1]=upper;

        System.out.println(Arrays.toString(arr1));

    }

    static int lower_bound(int [] arr , int target){
        int start =0;
        int end = arr.length-1;
        int ans=-1;

        while(start<=end){
            int mid = start +(end-start)/2;

            if(arr[mid] >= target){
                ans = mid;
                end =mid-1;
            }
            else{
                start = mid+1;
            }
        }

        return ans;
    }
    static int upper_bound(int [] arr , int target){
        int start = 0;
        int end = arr.length -1;
        int ans =-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }

        return ans;

    }
}
