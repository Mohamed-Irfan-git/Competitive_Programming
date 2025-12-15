package com.example.array.medium;

public class Kadanes {
    public static void main(String[] args) {
        int [] arr = {2, 3, 5, -2, 7, -4};
        longestSum(arr);

    }
    public static void longestSum(int [] arr){
        int start =0;
        int ansStart =0;
        int ansEnd =0;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

            if(sum == 0){
                start = i;
            }

            if(sum > maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0){
                sum = 0;
            }


        }
        System.out.println(maxSum);
        System.out.print(ansEnd+" "+ansStart);

    }
}
