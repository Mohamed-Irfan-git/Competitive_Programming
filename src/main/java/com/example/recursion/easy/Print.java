package com.example.recursion.easy;

public class Print {
    public static void main(String[] args) {
        print(10);

    }
    public static void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);

    }
}
