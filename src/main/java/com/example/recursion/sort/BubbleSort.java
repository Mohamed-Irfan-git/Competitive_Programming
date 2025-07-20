package com.example.recursion.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {20,45,69,56};
        bubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubbleSort(int[] arr,int strat,int end){
        if(strat==0){
            return;
        }
        if(strat>end){
            if(arr[end]>arr[end+1]){
                int temp=arr[end];
                arr[end]=arr[end+1];
                arr[end+1]=temp;
            }
            bubbleSort(arr,strat,end+1);
        }else {
            bubbleSort(arr,strat-1,end);
        }


    }
}
