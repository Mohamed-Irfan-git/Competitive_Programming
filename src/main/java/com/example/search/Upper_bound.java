package com.example.search;

public class Upper_bound {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        System.out.println(upper_bound(arr,20));

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
