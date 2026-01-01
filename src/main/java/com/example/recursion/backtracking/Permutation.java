package com.example.recursion.backtracking;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        boolean[] visited = new boolean[arr.length];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        permuteUnique(arr,list,temp,visited);

        System.out.println(list);

    }
    public static void permuteUnique(int[] nums , ArrayList<ArrayList<Integer>> list,ArrayList<Integer> temp,boolean[] visited) {
        if(nums.length == temp.size()) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.length; i++) {
            if(visited[i]) continue;
            visited[i] = true;

            temp.add(nums[i]);
            permuteUnique(nums, list, temp, visited);
            temp.remove(temp.size()-1);
            visited[i] = false;
        }

    }
}
