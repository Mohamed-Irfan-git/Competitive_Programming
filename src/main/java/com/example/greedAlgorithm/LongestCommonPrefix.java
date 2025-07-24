package com.example.greedAlgorithm;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = new String[]{"flower","flow","flight"};
        System.out.println(lcm(strs));
    }
    public static String lcm(String [] str){
        String prefix = str [0];
        for(int index = 1;index<str.length;index++){
            while(str[index].indexOf(prefix)!=-0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
