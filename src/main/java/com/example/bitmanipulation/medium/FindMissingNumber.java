package com.example.bitmanipulation.medium;

public class FindMissingNumber {
    public static void main(String[] args) {
        int []  arr = {0,1,2,3,5};
        System.out.println(findMissing2(arr));

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

    static int findMissing2(int [] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        int sum2 = 0;
        for(int i = 1; i < nums.length+1; i++){
            sum2 += i;
        }
        return sum2 - sum;
    }
}
