package com.example.dyanamic_programming.hard;

public class Knapsack {
    public static void main(String[] args) {
        int [] value = {60,100,120};
        int [] weight = {10,20,30};
        int n = value.length;
        int capacity = 50;

        int [][] dp = new int[n+1][capacity+1];

        for(int i = 0; i <=n; i++){
            for(int j = 0; j <= capacity; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println( knapsack(value,weight,n,capacity,dp));
    }

    static int knapsack(int[] value, int[] weight, int n, int w, int[][] dp) {
        if(n==0 || w==0){
            return 0;
        }
        if(dp[n][w]!=-1){
            return dp[n][w];
        }

        if (weight[n - 1] > w) {
            return  knapsack(value, weight, n - 1, w, dp);
        }
        else{
            int inclusive = value[n - 1] + knapsack(value, weight, n - 1, w-weight[n-1], dp);
            int exclusive = knapsack(value, weight, n - 1, w, dp);
            return dp[n][w] = Math.max(inclusive, exclusive);
        }


    }
}
