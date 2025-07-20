package com.example.search;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5};
        System.out.println(binarySearch(arr,7));

    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
        int mid= start+(end-start)/2;

        //we are divide the problem to small using thoses variable
        while(start < end){
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            mid=(start+end)/2;
        }
       return -1;
    }
}
