package com.example.sorting;

public class MaxProfit {
    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        System.out.println(maxProf(arr));

    }
    public static int maxProfit(int[] prices) {
        int maxProfit =0;
        int max = 0;
        int buy = 0;
        for(int i =0;i<prices.length-1;i++){
            buy = prices[i];
            for(int j=i+1;j<prices.length;j++){
                max = prices[j]-buy;

                maxProfit = Math.max(max,maxProfit);

            }

        }
        return maxProfit;

    }

    public static int maxProf(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price:prices){
            if(price < minPrice){
                minPrice = price;
            }
            else{
                maxProfit = Math.max(maxProfit,price - minPrice);
            }
        }
        return maxProfit;
    }
}
