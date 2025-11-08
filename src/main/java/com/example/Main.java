package com.example;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.bitCount(13)); // count how many ones there
        System.out.println(Integer.toBinaryString(13));// convert number to binary
        System.out.println(Integer.highestOneBit(13));
        System.out.println(Integer.lowestOneBit(13));

    }


    public static void hello(String a){
        System.out.println("a");
    }

    public static String hello2(String a){
        return a;
    }
}