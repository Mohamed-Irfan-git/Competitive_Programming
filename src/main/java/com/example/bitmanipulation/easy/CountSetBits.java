package com.example.bitmanipulation.easy;

public class CountSetBits {
    public static void main(String[] args) {
        countSetBits(10);
    }

    static void countSetBits(int n){
        int count = 0;

        while(n!=0){
            n = n & (n-1);
            count++;
        }

        System.out.println(count);
    }
}
