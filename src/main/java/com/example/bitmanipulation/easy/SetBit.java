package com.example.bitmanipulation.easy;

public class SetBit {
    public static void main(String[] args) {
        setBit(13,1);
    }
    static void setBit(int n,int i) {
        int result = n | (1<<i);
        System.out.println(result);

    }
}
