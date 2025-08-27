package com.example.greedAlgorithm;


public class LemanadChange {
    public static void main(String[] args) {
        int [] bills = {5,5,5,10,20};
        System.out.println(lemanadeChange(bills));
    }
    public static boolean lemanadeChange(int[] bills){
       int five =0;
       int ten = 0;

        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five >= 1) {
                    five = five - 1;
                    ten++;
                } else {
                    return false;
                }
            } else {
                if (ten >= 1 && five >= 1) {
                    ten = ten - 1;
                    five = five - 1;
                } else if (five >= 3) {
                    five = five - 3;

                } else {
                    return false;
                }
            }
        }
       return true;
    }
}
