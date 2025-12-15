package com.example.array.medium;

import java.util.Arrays;

public class Alter {
    public static void main(String[] args) {

        int [] arr = {3,1,-2,-5,2,-4};
        alter(arr);

    }
    public static void alter(int[] arr){
        int pos = 0;
        int neg = 1;

        while(pos <= arr.length-1 && neg <= arr.length-1){
            if(arr.length-1 > neg && arr.length-1 > pos){
                if( arr[pos] < 0 && arr[neg]>0){
                    int temp = arr[pos];
                    arr[pos] = arr[neg];
                    arr[neg] = temp;

                    pos+=2;
                    neg+=2;
                }
            else if(arr[neg] < 0){
                neg = neg +2;
            }
            else{
                pos = pos +2;
                }
            }


        }
        System.out.println(Arrays.toString(arr));
    }
}
