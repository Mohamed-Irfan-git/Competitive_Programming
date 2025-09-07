package com.example.bitmanipulation.medium;

public class SingleNumber {
    public static void main(String[] args) {
        int []  arr = {2,2,3,4,6,6,4};
        System.out.println(singleNumber(arr));

    }
     static int singleNumber(int[] arr){
        int xor = 0;

         for (int j : arr) {
             xor ^= j;
         }
        return xor;
     }
}
