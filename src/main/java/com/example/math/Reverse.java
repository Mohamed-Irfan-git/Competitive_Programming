package com.example.math;

public class Reverse {
    public static void main(String[] args) {
        int n = 123589;
        reverse(n);
    }

    public static void reverse(int n){
        int res = 0;
        while(n>0){
            int rem = n%10;
            res = res*10+rem;
            n = n/10;
        }

        System.out.println(res);
    }
}
