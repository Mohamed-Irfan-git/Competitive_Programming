package com.example.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            //monitoring tool
            int j=i-1;

            //we using here key and pointer not c pointer
            while(j>=0&&arr[j]>current){
                arr[j+1]=arr[j];
                j=j-1;

            }
            //add that current value into smaller index
            arr[j+1]=current;
            System.out.println(Arrays.toString(arr));
        }
        return arr;

    }
}
