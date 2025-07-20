package com.example.recursion.easy;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(10050,0));
    }
    public static int countZeros(int num,int count){
        if(num==0){
            return count;
        }
        int rem = num%10;
        if(rem==0){
            return countZeros(num/10,count+1);
        }
        return countZeros(num/10,count);

    }
}
