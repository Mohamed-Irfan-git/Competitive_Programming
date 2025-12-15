package com.example.array.easy;


public class SecondLargest {
    public static void main(String[] args) {
        int [] arr = {10,25,29,1,58,3};
        secondLargest(arr);

    }

    public static void secondLargest(int[] arr){
        int largest = 0;
        int secondLargest = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(largest > arr[i] && arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }

        System.out.println(secondLargest);
    }
}
