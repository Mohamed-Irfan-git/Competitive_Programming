package com.example.recursion.easy;

public class CountSteps {
    public static void main(String[] args) {
        System.out.println(count(25,0));
    }
    public static int count(int n,int steps){
        if(n==0){
            return steps;
        }
        if(n%2!=0){
            return count(n-1,steps+1);
        }
        return count(n/2,steps+1);
    }
}
