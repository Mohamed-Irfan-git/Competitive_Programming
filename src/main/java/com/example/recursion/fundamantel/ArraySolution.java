package com.example.recursion.fundamantel;

public class ArraySolution {
    public static void main(String[] args) {
        int [] nums = {10,15,23,18,5};
        int start = 0;
        int end = nums.length-1;
        rev("","hello");

    }
    static int min(int [] arr , int start, int end , int min) {
        if(end < start) {
            return min;
        }

        if(arr[start] < min){
            return min(arr,start+1,end,arr[start]);
        }
        return min(arr,start+1,end,min);
    }


    static int max(int [] arr , int start, int end , int max) {
        if(end < start) {
            return max;
        }

        if(arr[start] > max){
            return max(arr,start+1,end,arr[start]);
        }
        return max(arr,start+1,end,max);
    }


    static void rev(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        rev(ch+p,up.substring(1));
    }
}
