package com.example.striver_java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    // extreme brute force solution n ^ 3
    // we have to convert this into at least n^2
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;


        for(int i =0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    int target = nums[i] + nums[j] + nums[k];
                    if(target ==0){
                        List<Integer> ls = Arrays.asList(nums[i],nums[j],nums[k]);
                        ls.sort(Integer::compareTo);
                        set.add(ls);
                    }
                }
            }
        }


        return new ArrayList<>(set);
    }
}
