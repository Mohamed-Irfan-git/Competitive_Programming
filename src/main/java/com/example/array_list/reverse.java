package com.example.array_list;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [] arr = {12,69,63,98};
        recursiveRev(arr,0,arr.length-1);
//        rev(arr);
    }
    public static void rev(int[] arr){
       int start = 0;
       int end = arr.length-1;

       while(start<end){
           int temp = arr[start];
           arr[start]=arr[end];
           arr[end]=temp;

           start++;
           end--;
       }
        System.out.println(Arrays.toString(arr));
    }

    public static void recursiveRev(int[] arr,int left,int right){
        if(left>=right){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        recursiveRev(arr,left+1,right-1);
    }
}
