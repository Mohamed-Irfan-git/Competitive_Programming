package com.example.string.easy;


public class LastStringLen {
    public static void main(String[] args) {
        System.out.println(lastStringLen("Moahemed irfan"));


    }
    public static int lastStringLen(String S) {
        if (S == null || S.isEmpty()) {
            return 0;
        }
        String[] str = S.split(" ");
        return str[str.length - 1].length();

    }
}
