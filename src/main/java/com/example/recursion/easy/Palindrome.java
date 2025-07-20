package com.example.recursion.easy;

import static com.example.recursion.easy.ReverseNumber.reverse;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1));

    }
    public static boolean isPalindrome(int x) {
        return x==reverse(x);
    }
}
