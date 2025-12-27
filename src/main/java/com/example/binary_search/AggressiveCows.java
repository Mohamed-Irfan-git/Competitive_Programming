package com.example.binary_search;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int [] arr = {4,2,1,3,6};
        int cows = 2;
        int [] arr1 = Arrays.stream(arr).sorted().toArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(cowsAggressive(arr1,cows));

    }
    static int cowsAggressive(int[] stalls , int cows) {
        int low = 1;
        int max = Arrays.stream(stalls).max().getAsInt();
        int min = Arrays.stream(stalls).min().getAsInt();
        int high = max-min;


        while (low <= high) {
            int mid = (low + high)/2;

            if(isPossibleCows(stalls,cows,mid)){
                low = mid + 1;

            }
            else{
                high = mid - 1;
            }
        }
        return high;

    }

    static boolean isPossibleCows(int[] stalls, int cows, int distance) {
        int cow = stalls[0];
        int totalCows = 1;

        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-cow>=distance){
                totalCows++;
                cow = stalls[i];
            }

        }

        return totalCows >=cows;
    }
}
