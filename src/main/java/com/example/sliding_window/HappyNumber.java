package com.example.sliding_window;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;

        int slow = getSqure(n);
        int fast = getSqure(getSqure(n));

        while(fast != 1 && slow!=fast){
            slow = getSqure(slow);
            fast = getSqure(getSqure(fast));
        }
        if(fast==1){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

    private static int  getSqure(int n){
        int sum = 0;
        int rem = 0;
        while(n>0){
            rem = n%10;
            sum = sum+rem*rem;
            n=n/10;
        }
        return sum;
    }
}
