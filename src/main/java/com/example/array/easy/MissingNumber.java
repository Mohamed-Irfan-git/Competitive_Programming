package com.example.array.easy;

import com.example.recursion.sort.QuickSort;

import java.util.Arrays;

// 1 => n
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,5};
        findMissingNumber3(arr);
    }

    public static void findMissingNumber(int[] arr) {
        int n = arr.length;

        int sum = n*(n+1)/2;
        int sum1 = 0;

        for (int i = 0; i < n; i++) {
            sum1 += arr[i];
        }

        System.out.println(sum-sum1);
    }

    public static void findMissingNumber2(int[] arr,int n) {
        int xor = 0;

        for (int i = 1; i <= 6; i++) {
            xor ^= i;
        }

        for (int i = 0; i <= arr.length-1; i++) {
            xor ^= arr[i];
        }

        System.out.println(xor);
    }

    // cyclic sort very very important
    public static void findMissingNumber3(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correctIndex = arr[i]-1;

            if(arr[i] >1 && arr[i] <= arr.length && arr[i] != arr[correctIndex] ) {
                QuickSort.swap(arr, correctIndex, i);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}

