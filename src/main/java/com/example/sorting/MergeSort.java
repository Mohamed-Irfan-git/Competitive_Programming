package com.example.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 36,15,42,1,9,8,2,18 };
        mergeSort(arr);
        //dynamcally array's value change that's why here also changed
        System.out.println(Arrays.toString(arr));


    }

    public static void mergeSort(int[] arr) {
        //base case of the mergeSort
       if(arr.length<=1){
           return;
       }
       int mid = arr.length/2;

       //in here just copy the array and put it into new array
       int [] right = Arrays.copyOfRange(arr,0,mid);
       int [] left = Arrays.copyOfRange(arr,mid,arr.length);


       //divide arr into two part left,right
       mergeSort(right);
       mergeSort(left);

       sort(arr,left,right);

    }

    //this method sort left array and right array using two pointers
    public static void sort(int[] arr,int[] left,int[] right) {
     int i =0;
     int k=0;
     int j =0;

     //using two pointer checking one pointer use to add in to the array
     while(i<left.length&&j<right.length){
         if(left[i]<right[j]){
             arr[k]=left[i];
             k++;
             i++;
         }
         else if(right[j]<left[i]){
             arr[k]=right[j];
             k++;
             j++;
         }
     }


     //we're sorting here balanced elements in this array
     while(i<left.length){
         arr[k]=left[i];
         k++;
         i++;
     }
     while(j<right.length){
         arr[k]=right[j];
         k++;
         j++;
     }
    }
}
