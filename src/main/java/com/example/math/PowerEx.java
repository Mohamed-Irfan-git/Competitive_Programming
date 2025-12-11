package com.example.math;

public class PowerEx {
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }

        int res = power(a,b/2);

        if (b%2 == 0) {
            return res*res;
        }
        return res*res*a;

    }
}
