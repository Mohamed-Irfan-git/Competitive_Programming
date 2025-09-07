package com.example.bitmanipulation.easy;

public class ClearBit {
    public static void main(String[] args) {
        clearBit(13,2);

    }
    static void clearBit(int n , int i){
        int result = n & ~(1<<i);
        System.out.println(result);

    }
}
