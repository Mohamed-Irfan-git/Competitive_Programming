package com.example.math;

import java.util.Arrays;

public class Prime {
    public static void main(String[] args) {
        boolean [] prime = prime2(7);
        System.out.println(prime[7]);

    }

    public static boolean prime1(int n){
        if(n<2){
            return false;
        }

        if(n==2){
            return true;
        }

        if(n%2==0){
            return false;
        }

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    public static  boolean [] prime2(int n){
        boolean [] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;
        arr[1]=false;

        for(int i=2;i*i<=n;i++){
            if(arr[i]){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }

        }
        return arr;


    }
}
