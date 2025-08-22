package com.example.string.easy;

public class IsPalindrom {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(str));

    }
    public static boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase().replaceAll("[^a-z0-9]","");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
    public static boolean isPalindrome2(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        StringBuffer sb = new StringBuffer(s).reverse();
        String b = sb.toString().toLowerCase().replaceAll("[^a-z0-9]","");

        if(s.equals(b)){
            return true;
        }
        return false;

    }
}
