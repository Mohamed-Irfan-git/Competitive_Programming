package com.example.binary_search;

import java.util.Arrays;

public class PainterPartition {
    public static void main(String[] args) {
        int [] arr = {2,3,1,2,4,3};
        int k = 5 ;
        System.out.println(painterPartition(arr,k));

    }
    static int painterPartition(int[] arr,int k){
        int low = Arrays.stream(arr).max().getAsInt();
        int high = Arrays.stream(arr).sum();
        while(low<=high){
            int mid = (low+high)/2;
            int painters = isPossiblePaint(arr,mid);
            if(painters > k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;

    }

    static int isPossiblePaint(int[] arr,int i){
        int painters = 1;
        int totalPaint = 0;

        for(int j=0;j<arr.length;j++){
            if(arr[j] + totalPaint <= i){
                totalPaint += arr[j];
            }
            else{
                painters++;
                totalPaint = arr[j];
            }
        }
        return painters ;
    }
}
