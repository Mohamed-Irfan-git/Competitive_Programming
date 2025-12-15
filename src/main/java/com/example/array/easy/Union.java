package com.example.array.easy;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
        int [] arr = {1,2,2,3,3,4};
        int [] arr2 = {1,2,3,4,6,7};
        union(arr,arr2);


    }

    public static void union(int[] arr1, int[] arr2) {
        ArrayList<Integer> union = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                addIfNotDuplicate(union, arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                addIfNotDuplicate(union, arr1[i]);
                i++;
            }
            else {
                addIfNotDuplicate(union, arr2[j]);
                j++;
            }
        }

        while (i < arr1.length) {
            addIfNotDuplicate(union, arr1[i]);
            i++;
        }

        while (j < arr2.length) {
            addIfNotDuplicate(union, arr2[j]);
            j++;
        }

        System.out.println(union);
    }

    private static void addIfNotDuplicate(ArrayList<Integer> list, int val) {
        if (list.isEmpty() || list.get(list.size() - 1) != val) {
            list.add(val);
        }
    }

}
