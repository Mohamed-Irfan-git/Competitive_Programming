package com.example.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr ={36,15,42,1,9,8,2,18};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));;

    }
    public static void quicksort(int[] arr,int start,int end){
        if(start>end){
            return;
        }
        int mid = start + (end - start)/2;
        int pivot = arr[mid];
        int s= start;
        int e= end;

        while(s<=e){
            while(arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
                swap(arr,s,e);
                s++;
                e--;
            }
        }

        //recursion call
        quicksort(arr,start,e);
        quicksort(arr,s,end);

    }
    //it rearrange the pivot
    public static void swap(int[] arr,int s,int e){
        int temp =arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
    }
}
