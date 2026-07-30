package com.example.math;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd1(10,5));

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

    public static int gcd1(int a,int b){
        if(b == 0){
            return a;
        }

        return gcd1(b,a%b);
    }
}
