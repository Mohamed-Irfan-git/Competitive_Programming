package com.example.array.hard;

import java.util.*;

public class Sum3 {
    public static void main(String[] args) {
        int [] arr = {-1,0,1,2,-1,-4};
        removeDuplicate2(arr,0);

    }

    static void removeDuplicate2(int[] arr,int target) {
        Arrays.sort(arr);
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            if(i>=1 && arr[i]==arr[i-1]){
                continue;
            }

            int j = i+1;
            int k = arr.length-1;

            while (j<k){

                int sum = arr[i]+arr[j]+arr[k];
               if(sum==target){

                   List<Integer> list = new ArrayList<>();
                   list.add(arr[i]);
                   list.add(arr[j]);
                   list.add(arr[k]);
                   Collections.sort(list);
                   set.add(list);

                   j++;
                   k--;

                   while (j<k && arr[j]==arr[j-1]){
                       j++;
                   }

                   while (j<k && arr[k]==arr[k+1]){
                       k--;
                   }

               }
               else if(sum < target){
                   j++;
               }
               else{
                   k--;
               }


            }
        }

        System.out.println(set);

    }
}
