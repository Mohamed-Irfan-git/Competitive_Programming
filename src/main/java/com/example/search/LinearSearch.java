package com.example.search;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {10,20,30,60,68,59};
        System.out.println(search(arr,68));

    }
    public static int search(int [] arr, int target) {
        int len = arr.length;
        for(int i = 0; i < len; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
