package com.example.binary_search;

public class SmallestDivisor {
    public static void main(String[] args) {
        int n = 5;
        int [] nums = {1,2,3,4,5};
        int limit = 8;

        System.out.println(smallestDivisor(n,nums,limit));

    }
    static int smallestDivisor(int n,int [] nums, int limit){
        int low =  nums[0];
        int high = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]< low){
                low = nums[i];
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>high){
                high = nums[i];
            }
        }

        while(low<=high){
            int mid = (low+high)/2;
            if(sumOfDivisor(nums,mid) <=limit){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;

    }

    static int sumOfDivisor(int [] nums,int divisor) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            double cl = Math.ceil((double)nums[i] / divisor);
            sum += (int)cl;
        }
        return sum;
    }
}
