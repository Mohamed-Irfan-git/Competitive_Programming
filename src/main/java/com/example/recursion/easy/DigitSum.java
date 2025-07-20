package com.example.recursion.easy;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(sum(15));
    }
    public static int sum(int num) {
        if(num==0){
            return num;
        }
        int rem = num%10;
        return rem+sum(num/10);
    }
}
