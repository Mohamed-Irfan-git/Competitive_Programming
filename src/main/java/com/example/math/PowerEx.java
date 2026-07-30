package com.example.math;

public class PowerEx {
    public static void main(String[] args) {
        System.out.println(power(2,3));
    }
    public static int power(int a, int b) {

        int ans = 1;
        while(b>0){
            if(b %2 !=0){
                ans = ans * a;
                b = b-1;

            }
            else{
                a = a*a;
                b = b/2;
            }
        }

        return ans;
    }
}
