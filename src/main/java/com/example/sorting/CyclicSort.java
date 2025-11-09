package com.example.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1};
        cyclicSort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));

        int [] arr3 = {1,3,4,5};
        missingNumber(arr3);

        int[] arr1 = {4,3,2,7,8,2,3,1};
        findDuplicate(arr1);
    }

    // Correct cyclic sort
    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // where this number should go

            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else {
                i++;
            }
        }
    }

    // Find ONE missing number (1 to n)
    static void missingNumber(int[] arr) {
        cyclicSort(arr);

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                System.out.println("Missing: " + (j + 1));
                return;
            }
        }
        // If nothing missing
        System.out.println("Missing: " + (arr.length + 1));
    }

    // Find ALL missing numbers
    static void findAllMissingNumber(int[] arr) {
        cyclicSort(arr);
        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(j + 1);
            }
        }

        System.out.println("All missing: " + list);
    }

    static void findDuplicate(int [] arr){
        int i = 0;
        HashSet<Integer> set = new HashSet<>();
        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // where this number should go

            if (arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else {
                if (arr[i] == arr[correctIndex] && i!= correctIndex) {
                    set.add(arr[i]);

                }
                i++;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(set);
        System.out.println("Duplicates: " + list);

    }
    static void findAllDuplicate(int[] arr){

    }
}
