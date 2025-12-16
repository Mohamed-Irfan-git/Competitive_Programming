package com.example.array.hard;

import java.util.Arrays;

public class Inversions {
    public static void main(String[] args) {
        int [] arr = {5,3,2,1,4};
        int val = mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        System.out.println(val);

    }
    static int mergeSort(int [] arr, int low, int high){
        int count = 0;

        if(low>=high){
            return count;
        }

        int mid = low + (high-low)/2;

        count += mergeSort(arr, low, mid);
        count +=mergeSort(arr, mid+1, high);

//        int right = mid + 1;
//        for(int i = low; i <= mid; i++){
//            while(right <= high && arr[i] > 2L * arr[right]) {
//                right++;
//            }
//            count += (right - (mid + 1));
//        }

        count +=mergeSortHelper(arr,low,mid,high);
        return count;
    }

    static int mergeSortHelper(int [] arr, int low, int mid, int high){
        int count =0;

        int [] temp = new int[high-low+1];
        int left = low;
        int right = mid+1;
        int index = 0;

        while(left<=mid && right<=high){

            if(arr[left]<=arr[right]){
                temp[index++]=arr[left++];
            }
            else {
                temp[index++]=arr[right++];
                count += mid-left+1;
            }
        }

        while(left<=mid){
            temp[index++]=arr[left++];
        }
        while(right<=high){
            temp[index++]=arr[right++];
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }

        return count;
    }
}
