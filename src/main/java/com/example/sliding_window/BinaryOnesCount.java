package com.example.sliding_window;

public class BinaryOnesCount {
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1,1};
        System.out.println(countBinaryOnes(arr));

    }
    public static int countBinaryOnes(int[] n){
        int max = 0;
        int count = 0;

        for(int num:n){
            if(num==1){
                count++;
                max = Math.max(max,count);
            }else{
                count = 0;
            }
        }


        return max;
    }
}
