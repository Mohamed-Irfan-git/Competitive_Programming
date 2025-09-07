package com.example.bitmanipulation.medium;

public class RangeXOR {
    public static void main(String[] args) {
        int ans = rangeXOR(9) ^ rangeXOR(3-1);
        System.out.println(ans);

    }
    static int rangeXOR(int n){
     if(n%4==0){
         return n;

     }
     if(n%4==1){
         return 1;
     }
     if(n%4==2){
         return n+1;
     }
     return 0;
    }
}
