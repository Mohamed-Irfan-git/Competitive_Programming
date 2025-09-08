package com.example.string.medium;

public class ConvertToInt {
    public static void main(String[] args) {
        System.out.println(convertInt("0-1"));
    }
    static int convertInt(String s){
        int sign = 1;
        int size = s.length();

        long result = 0;

        int count = 0;

        // skip leading space;
        while(count < size && s.charAt(count) == ' '){
            count++;
        }

        // assign that sign + or -
        if(count < size && s.charAt(count)=='-' || s.charAt(count)=='+'){
            if(s.charAt(count)=='-'){
                sign = -1;

            }
            count++;

        }

        while(count < size && Character.isDigit(s.charAt(count))){
            result =  result * 10 + s.charAt(count)-'0';
            count++;

        }

        return (int)(result * sign);



    }
}
