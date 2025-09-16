package com.example.recursion.fundamantel;

/**
 * in this a parameterized recursion
 * we know sum and n are the changing value, so put these as parameter
 * rem variable we are using just for calculating the last value
 */
public class SumOfNumber {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println(sum(1235,sum));
    }
    static int sum(int n,int sum) {
        if(n==0){
            return sum;
        }
        // get the last value of the number
       int rem = n%10;
        sum = sum + rem;
        return sum(n/10,sum);
    }
}
