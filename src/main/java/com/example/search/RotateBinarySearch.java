package com.example.search;

public class RotateBinarySearch {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3, 4};
        System.out.println(search(arr, 6, 0, arr.length - 1));

    }
    public static int search(int[] arr, int target, int start, int end) {
        if(start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if(arr[mid] == target) {
            return mid;
        }

        //left half sorted
        if(arr[start]<=arr[mid]) {
            if(arr[start]<=target && target<=arr[mid]) {
                return search(arr, target, start, mid - 1);
            }
            else {
                return search(arr, target, mid + 1, end);
            }

        }

        //right half sorted
        else {
            if(arr[mid]<=target && target<=arr[end]) {
                return search(arr, target, mid + 1, end);
            }
            else {
                return search(arr, target, start, mid - 1);
            }
        }

    }
}
