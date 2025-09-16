package com.example.recursion.fundamantel;


import java.util.Arrays;

/**
 * for this case, we need left right pointer that's are changing and our array also changing
 */
public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {5,3,4,2,9};
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
    static void reverse(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverse(arr,left+1,right);
    }
}
