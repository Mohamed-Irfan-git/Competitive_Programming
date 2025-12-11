package com.example.recursion.easy;

public class Print {
    public static void main(String[] args) {
        print1(1);

    }
    public static void print(int n){
        if (n==0){
            return;
        }
        print(n-1);
        System.out.println(n);

    }
    public static void print1(int n){
        if(n == 5){
            return;
        }

        System.out.println(n);
        n++;
        print1(n);
    }
}
