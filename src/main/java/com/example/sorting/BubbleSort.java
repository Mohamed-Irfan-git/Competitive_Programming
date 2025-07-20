package com.example.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(sortBubble(arr)));

    }
    public  static int[] sortBubble(int[] arr){
        int len = arr.length;

        //simple nested loop used here compare with current and next element if it is current element big just swap
        for (int i = 0; i < len; i++) {
          for (int j = i+1; j < len; j++) {
              if(arr[j] <= arr[i]){
                  //this wapping method i already wrote in QuickSort class that's why i used here
                  QuickSort.swap(arr, j, i);
              }
          }
        }
        return arr;

    }
}
