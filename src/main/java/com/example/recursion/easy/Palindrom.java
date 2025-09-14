package com.example.recursion.easy;

public class Palindrom {
    public static void main(String[] args) {
        String str = "mada";
        System.out.println(isPalindrom(str,0,str.length()-1));

    }
    static boolean isPalindrom(String str,int left,int right) {
        if(left==right){
            return true;
        }
        if(str.charAt(left)!=str.charAt(right)){
            return false;

        }
        boolean flag = isPalindrom(str,left+1,right-1);
        return flag;

    }
}
