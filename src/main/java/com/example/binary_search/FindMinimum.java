package com.example.binary_search;

public class FindMinimum {
    public static void main(String[] args) {
        int [] arr = {3,4,5,1,2};
        System.out.println(findMinimum(arr));

    }

    static int findMinimum(int [] nums){
        int low = 0;
        int high = nums.length-1;

        int mid = low+(high-low)/2;
        int minVal = Integer.MAX_VALUE;

        while(low<=high){

            if(nums[low]<nums[high] && nums[low] < nums[mid]){
                return  nums[low];
            }
            else if(nums[mid] > nums[low]){
                minVal = Math.min(minVal,nums[low]);
                low = mid+1;
            }
            else {
                minVal = Math.min(minVal,nums[low]);
                high = mid-1;
            }

            mid = low+(high-low)/2;
        }

        return minVal;



    }
}
