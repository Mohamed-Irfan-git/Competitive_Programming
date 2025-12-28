package com.example.recursion.easy;

public class Atoi {
    public static void main(String[] args) {
        int n = atoi("-1239");
        System.out.println(n);
    }
    static int toInt(String s , int result){
        if(s.isEmpty()) return result;

        if(s.charAt(0) < '0' && s.charAt(0)>'9'){
            return result;
        }

        int digit = s.charAt(0) - '0';
        result = result *10 + digit;
        s = s.substring(1,s.length());
        return toInt(s,result);
    }

    static int atoi(String s){
        int sign = 1;
        if(s.charAt(0) == '-'){
            sign = -1;
            s = s.substring(1);
        }

        else if(s.charAt(0) == '+'){
            sign = 1;
            s = s.substring(1);
        }
        int result = 0;
        return sign* toInt(s,result);
    }
}
