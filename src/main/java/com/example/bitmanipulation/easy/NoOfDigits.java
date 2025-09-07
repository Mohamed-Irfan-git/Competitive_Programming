package com.example.bitmanipulation.easy;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 556;
        int b = 10;

        int result =(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(result);
    }
}
