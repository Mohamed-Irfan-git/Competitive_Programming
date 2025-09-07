package com.example.bitmanipulation.easy;

public class ToggleBit {
    public static void main(String[] args) {
        toggleBit(13,2);

    }
    static void toggleBit(int n,int i){
        int result = n ^ (1<<i);
        System.out.println(result);
    }
}
