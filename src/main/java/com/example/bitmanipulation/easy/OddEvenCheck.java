package com.example.bitmanipulation.easy;

public class OddEvenCheck {
    public static void main(String[] args) {
        System.out.println(isOdd(15));
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
