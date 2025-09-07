package com.example.bitmanipulation.medium;

public class SingleNumber11 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3,3};
        System.out.println(singleNumber(arr));


    }
    static int singleNumber(int[] arr){
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int count = 0;
           for(int num : arr){
               if((num&(1<<i))!=0){
                   count++;
               }

           }
            if(count%3!=0){
                res = res|1<<i;
            }
        }
        return res;
    }
}
