package com.example.bitmanipulation.easy;



/*
*in here i am used xor
* which is give 1 if both bits are different
 */
public class Swap {
    public static void main(String[] args) {
        swap(10,15);
    }
    static void swap(int a , int b){
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
