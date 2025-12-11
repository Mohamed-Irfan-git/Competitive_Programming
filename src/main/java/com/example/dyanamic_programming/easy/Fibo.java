package com.example.dyanamic_programming.easy;

import java.util.Map;

public class Fibo {
    public static void main(String[] args) {
        int n = fibo(50);
        System.out.println(n);
    }
    public static int fibo(int n) {
        int first = 0, second = 1;
       for (int i = 2; i <= n; i++) {
           int temp = first + second;
           first = second;
           second = temp;
       }
       return second;
    }

    private static int fibo(int n , Map<Integer,Integer> memo){
        if(n<2){
            return n;
        }
        if(memo.containsKey(n)){
            return memo.get(n);

        }

        int val = fibo(n-1,memo) + fibo(n-2, memo);
        memo.put(n,val);
        return val;

    }
}
