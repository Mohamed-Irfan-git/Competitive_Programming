package com.example.bitmanipulation.medium;

public class FindMissingNumber {
    public static void main(String[] args) {
        int []  arr = {0,1,2,3};
        System.out.println(findMissing(arr));

    }
    static int findMissing(int [] nums){
        int xor = 0;
        for(int i = 0; i <=nums.length; i++){
            xor ^= i;
        }

        for(int num : nums){
            xor ^= num;
        }

        return xor;
    }
}
