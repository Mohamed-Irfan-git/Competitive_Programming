package com.example.prefix_sum;

public class Prefix1 {
    public static void main(String[] args) {
        int [] arr = {8,3,-2,4,10,-1,0,5,3};
        System.out.println(pre(arr,2,7));

    }
    public static int pre(int [] a,int k,int m){
        int [] p = new int[a.length+1];
         int len = 1;
         p[0] = 0;

        while(len < a.length){
            p[len] = p[len-1]+a[len-1];
            len++;
        }

        return p[m+1]-p[k];
    }
}
