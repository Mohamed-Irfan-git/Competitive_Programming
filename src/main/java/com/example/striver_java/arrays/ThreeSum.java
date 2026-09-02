package com.example.striver_java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {

    // extreme brute force solution n ^ 3
    // we have to convert this into at least n^2
    public List<List<Integer>> threeSum1(int[] nums) {
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


    public List<List<Integer>> twoSum2(int [] nums){
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> tst = new HashSet<>();
            for(int j=i+1;j<n;j++){
                int thirdValue = -(nums[i] + nums[j]);
                if(tst.contains(thirdValue)){
                    List<Integer> list = Arrays.asList(thirdValue,nums[i],nums[j]);
                    list.sort(Integer::compareTo);

                    set.add(list);
                }
                tst.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> twoSum3(int [] nums){
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int right = n-1;

        for(int i=0;i<n;i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;

            int left = i+1;

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> list = Arrays.asList(nums[i],nums[left],nums[right]);
                    ans.add(list);
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left-1]){
                        left++;
                    }

                    while (left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }

                if(sum < 0){
                    left++;
                }
                else{
                    right++;
                }
            }
        }

        return ans;

    }
}
