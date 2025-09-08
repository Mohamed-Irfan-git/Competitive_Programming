package com.example.collections;

import java.util.Arrays;
import java.util.Collections;

public class ArrayMethods {
    public static void main(String[] args) {
        Integer [] arr = {5,9,15,25,12,32};
        arrayMethods(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void arrayMethods(Integer [] arr){
        Arrays.sort(arr); // this immediately sort the array internally using quicksort O(n log n);
        Arrays.sort(arr,Collections.reverseOrder()); // this only works for wrapper class
        Integer[] nums = Arrays.copyOf(arr,3);//copy first 3 element to new array
        Integer[] nums2 = Arrays.copyOfRange(arr,3,arr.length); // specifically telling copy these range
//        Arrays.fill(nums,0); // filling with 0

        int [] arr1 = {15,25,16,19,32};
        boolean bol= Arrays.equals(arr,nums); // check that element are equals or not

        int sum = Arrays.stream(arr1).sum();
        int max = Arrays.stream(arr1).max().getAsInt();
        int min = Arrays.stream(arr1).min().getAsInt();









    }
}
