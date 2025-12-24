package com.example.binary_search;


import com.example.sorting.QuickSort;

import java.util.Arrays;

public class Upperbound {
    public static void main(String[] args) {
        int [] arr = {2,8,9,2,1,3,3,8,4,3};
        QuickSort quick = new QuickSort();
        quick.quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        upperbound(arr,3);

    }

    static void upperbound(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        int mid = start + (end-start)/2;

        int index = -1;

        while(start<=end){
            if(arr[mid] == target){
                index = mid;
                end = mid-1;
            }
            else if(arr[mid] < target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }

            mid = start + (end-start)/2;
        }

        System.out.println(index);

        int  upperbound = index+1;
        for(int i = index+1;i<arr.length;i++){
            if(arr[index] < arr[i]){
                upperbound = i;
                break;
            }

        }

        int lower_val = 0;

        for(int i = 0;i<upperbound;i++){
            lower_val += arr[i];
        }

        int upperVal = 0;
        for(int i = upperbound;i<arr.length;i++){
            upperVal += arr[i];
        }

        System.out.println(upperVal - lower_val);
    }

}
