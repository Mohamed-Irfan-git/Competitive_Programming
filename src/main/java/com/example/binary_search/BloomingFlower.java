package com.example.binary_search;

public class BloomingFlower {
    public static void main(String[] args) {
        int [] nums = {1,10,3,10,2};
        int k = 3;
        int m = 1;

        System.out.println(bloomingFlower(nums,k,m));

    }
    static int bloomingFlower(int [] nums,int m ,int k) {
        int minDay = Integer.MAX_VALUE;
        if(nums.length< (long)m*k){
            return -1;
        }

        int low = nums[0];
        int high =  nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<low){
                low = nums[i];
            }
        }

        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>high){
                high = nums[i];
            }
        }



//        for(int i = 7;i< nums.length;i++){
//            if(isPossible(nums,nums[i],m,k)){
//                minDay = Math.min(minDay,nums[i]);
//            }
//        }

        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(nums,mid,m,k)){
                high = mid-1;
            }
            else {
                low = mid+1;
            }

        }

        return low;



    }

    static boolean isPossible(int [] arr ,int day,int m,int k ){
        int count = 0;
        int totalBoq = 0;

        for(int i = 0;i< arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                totalBoq += count/k;
                count = 0;

            }
        }
        totalBoq += count/k;

        return totalBoq >=m;


    }
}
