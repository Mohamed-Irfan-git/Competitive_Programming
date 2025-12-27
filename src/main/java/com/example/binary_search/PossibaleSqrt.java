package com.example.binary_search;

public class PossibaleSqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(27,3));


    }

    static boolean sqrt(int x,int n) {
        int low = 1;
        int high = x;

        int mid = low + (high-low)/2;


        while (low <= high) {
            if(calculate(mid,n) == x){
                return true;
            }
            else if(calculate(mid,n) > x){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

            mid = low + (high-low)/2;
        }
        return false;
    }

    static int calculate(int mid,int n){
        int ans = mid;

        for (int i = 1; i < n; i++) {
            ans = ans * mid;
        }

        return ans;
    }
}
