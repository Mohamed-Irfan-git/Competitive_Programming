package com.example.dyanamic_programming;

import java.util.Arrays;

public class FindWay {
    public static void main(String[] args) {
        int [] arr1 = {1,3,1,4,2,6};
        int [] arr2 = {1,4,1,1,6};
        int realSum = 10;
        System.out.println(twoStacks(arr1,arr2,realSum));

    }
    static int twoStacks(int [] a, int [] b,int realSum){
        return twoStacks(a,b,realSum,0,0)-1;
    }
    private static int twoStacks(int [] a,int [] b,int realSum,int sum,int count){
        if(sum>realSum){
            return count;
        }
        if(a.length==0||b.length==0){
            return count;
        }

        int right= twoStacks(Arrays.copyOfRange(a,1,a.length),b,realSum,sum+a[0],count+1);
        int left= twoStacks(a,Arrays.copyOfRange(b,1,b.length),realSum,sum+b[0],count+1);

        return Math.max(left,right);

    }
}
