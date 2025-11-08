package com.example.sorting;


import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,1};
        cyclicSort(arr);

        int [] arr1 = {4,2,1,5};
        missingNumber(arr1);

        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int [] arr){
       int i =0;
       while(i<arr.length){
           if(arr[i]!=i+1){
               if(arr[i]<=arr.length){
                   int temp=arr[i];
                   arr[i]=arr[temp-1];
                   arr[temp-1]=temp;
               }
               i++;
           }
           else {
               i++;
           }
       }
    }

    static void  missingNumber(int [] arr){
        cyclicSort(arr);
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j+1){
                System.out.println(j+1);
                return;
            }
        }
    }
}
