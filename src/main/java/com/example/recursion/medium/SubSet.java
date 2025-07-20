package com.example.recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int [] arr = {1,2,2};
        List<List<Integer>> ans = subsetsDuplicate(arr);
//       for (List<Integer> list : ans) {
//           System.out.println(list);
//       }
        System.out.println(ans);

    }
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : nums){
            int size = outer.size();
            for(int i = 0; i < size; i++){
                List<Integer> subset = new ArrayList<>(outer.get(i));
                subset.add(num);
                outer.add(subset);
            }
        }

        return outer;
    }

    public static List<List<Integer>> subsetsDuplicate(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end = 0;
        for(int i = 0; i < nums.length; i++){
            start = 0;
            if(i > 0 && nums[i] == nums[i-1]){
                start = end+1;
            }
            int size = outer.size();
            end = outer.size()-1;
            for(int j = start; j < size; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
