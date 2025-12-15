package com.example.math;

public class GCD {
    public static void main(String[] args) {
        gcd1(20,15);

    }

    public static void gcd(int a,int b){
       while(a!=b){
           if(a>b){
               a = a-b;
           }else{
               b = b-a;
           }

       }

        System.out.println(a);
    }

    public static void gcd1(int a,int b){
        while(b!=0){
            int rem = a % b;
            a = b;
            b = rem;
        }

        System.out.println(a);
    }
}
