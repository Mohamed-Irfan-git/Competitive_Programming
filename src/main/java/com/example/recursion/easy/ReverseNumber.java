package com.example.recursion.easy;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1559914));
    }
    public static int reverse(int x) {

        int noOfDigits=(int)Math.log10(x)+1;
        return helper(x,noOfDigits);
    }

    private static int helper(int x, int noOfDigits) {
        if(x==0){
            return x;
        }
        int rem = x%10;
        int total=rem * (int)Math.pow(10, (noOfDigits-1));
        return total+helper(x/10,noOfDigits-1);
    }
}
