package com.example.array.easy;

import java.util.Arrays;

public class ZeroLast {
    public static void main(String[] args) {
        int [] arr ={1,1,0,2,3,0,4,0,3};
        zeroLast(arr);

    }


    public static void zeroLast(int[] arr){
        int i =0;

        for(int j=1;j<arr.length;j++){
            if(arr[i] != 0){
                i++;
            }


            if(arr[i]==0 && arr[j] !=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void zeroLast1(int[] arr) {
        int i = 0; // position for next non-zero

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
