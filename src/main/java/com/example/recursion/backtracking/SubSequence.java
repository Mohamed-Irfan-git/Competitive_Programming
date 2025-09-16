package com.example.recursion.backtracking;

import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(backtracking(arr, 0, new ArrayList<>()));
        System.out.println();
    }

    static ArrayList<ArrayList<Integer>> backtracking(int[] array, int index, ArrayList<Integer> current) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        // Base case: reached end of array
        if (index == array.length) {
            result.add(new ArrayList<>(current)); // add copy of current path
            return result;
        }

        // Choice 1: include array[index]
        current.add(array[index]);

        System.out.println("adding in to current "+ result);
        result.addAll(backtracking(array, index + 1, current));
        System.out.println("before remove  "+ result);

        //Backtrack
        current.remove(current.size() - 1);
        System.out.println("after remove  "+ result);


        //Choice 2: exclude array[index]
        result.addAll(backtracking(array, index + 1, current));
        System.out.println("before remove add "+ result);

        return result;
    }

    static ArrayList<ArrayList<Integer>> back(int[] arr, int n) {

        if (n == arr.length) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>()); // empty subset
            return list;
        }

        // Recursive call: get subsets of the remaining elements
        ArrayList<ArrayList<Integer>> subsets = back(arr, n + 1);

        // Exclude arr[n] → just take subsets as they are
        ArrayList<ArrayList<Integer>> result = new ArrayList<>(subsets);

        // Include arr[n] → add arr[n] to each subset
        for (ArrayList<Integer> subset : subsets) {
            ArrayList<Integer> newSubset = new ArrayList<>(subset);
            newSubset.add(0, arr[n]); // add arr[n] at the front
            result.add(newSubset);
        }

        return result;
    }

}
