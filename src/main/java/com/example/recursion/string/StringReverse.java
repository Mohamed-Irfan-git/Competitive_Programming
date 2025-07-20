package com.example.recursion.string;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString(" ","hello"));
    }
    public static String reverseString(String str, String string){
        if(string.isEmpty()){
            return str;
        }
        String ch = String.valueOf(string.charAt(0));
        return reverseString(str,string.substring(1))+ch;

    }
}
