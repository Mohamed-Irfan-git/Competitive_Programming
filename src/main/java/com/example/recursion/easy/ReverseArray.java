package com.example.recursion.easy;

import com.example.recursion.sort.QuickSort;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr ={35,15,89,26,99};
        System.out.println(Arrays.toString(arr));

        reverse(arr,0);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[] arr,int i){
        if(i>=arr.length/2){
            return;
        }
        int a = arr.length-i-1;

        QuickSort.swap(arr, i, a);

        reverse(arr,a);

    }
}
