package com.example.recursion.easy;

public class DigitProduct {
    public static void main(String[] args) {
        System.out.println(digitProduct(332));

    }
    public static int digitProduct(int num) {
        if(num%10==num){
            return num;
        }
        int rem = num%10;
        return rem*digitProduct(num/10);

    }
}
