package com.example.math;

public class DigitCount {
    public static void main(String[] args) {
        int n = 123589;
        count(n);
    }

    public static void count(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }

        System.out.println(count);
    }
}
