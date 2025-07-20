package com.example.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(selectionSort(arr)));

    }

    //return type is integer array
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //we are just assume as first index in value is the minimum value
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                //in here check that value is small or not if not change that index
                if(arr[i]>arr[j]){
                   minIndex = j;
                }
            }
            //i replace with QuickSort class swap method
            //in here we are swapping in outer loop
            QuickSort.swap(arr, i, minIndex);


        }
        return arr;
    }
}
