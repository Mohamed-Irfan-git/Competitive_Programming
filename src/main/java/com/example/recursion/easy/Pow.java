package com.example.recursion.easy;

public class Pow {
    public static void main(String[] args) {
        System.out.println(myPow(2,-2));

    }
    static double pow(double x, double n) {
        if (n==0){
            return 1;
        }
        if (n==1){
            return x;
        }


        if (n%2==0){
            return pow(x*x,n/2);
        }
        else  {
            return x * pow(x,n-1);
        }
    }

    static double myPow(int x, int n){
        int num = n;

        if(num < 0){
            return 1/pow(x,-1*num);
        }
        return pow(x,n);
    }
}
