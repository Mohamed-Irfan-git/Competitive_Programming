package com.example.binary_search;

import java.util.Scanner;

public class SquareRootFinding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(squareRoot(n));

    }
    static int squareRoot(int n){
        int low = 1;
        int high = n;
        int ans = -1;

        while(low <= high){
            int mid = (low + high)/2;
            if(mid*mid <= n){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return ans;
    }
}
