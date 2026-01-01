package com.example.recursion.fundamantel;

public class Summing {
    public static void main(String[] args) {

    }
    static int sum(int n){
        if(n==0){
            return 0;
        }

        return n +sum(n-1);

    }
}
