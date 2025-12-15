package com.example.array.easy;

import com.example.recursion.sort.QuickSort;


public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4};
        findMissingNumber3(arr);

    }
    public static void findMissingNumber3(int[] arr) {
        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i]-1;

            if(arr[i] >1 && arr[i] <= arr.length && arr[i] != arr[correctIndex] ) {
                QuickSort.swap(arr, correctIndex, i);
            }

            else{
                if(arr[i] == arr[correctIndex] && i != correctIndex) {
                    System.out.println(arr[i]);
                }
                i++;
            }
        }

    }
}
