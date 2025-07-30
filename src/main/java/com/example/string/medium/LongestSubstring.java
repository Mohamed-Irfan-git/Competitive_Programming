package com.example.string.medium;
import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        int[]arr = {5,4,2,3,9,7,4,2};
        System.out.println(sub2(arr,14));


    }
    public static int sub(String s){
        int size = s.length();
        int max = 0;
        int start = 0;

        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i < size; i++){
            char c = s.charAt(i);
            while (set.contains(c)){
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            max = Math.max(max, (i-start )+ 1);
        }
        return max;
    }

    public static int sub1(String s){
        int size = s.length();
        int max = 0;
        String current = "";

        for(int i = 0; i < size; i++){
            char c = s.charAt(i);

            if(current.contains(String.valueOf(c))){
                int index = current.indexOf(c);
                current = current.substring(index+1);
            }

            current=current+c;
        }
        if(current.length()>max){
            max=current.length();
        }
        return max;
    }


    public static int sub2(int [] arr,int mxSum){
        int size = arr.length;
        int start = 0;
        int end = 0;
        int count =0;

        int sum = 0;
        while (end < size ){

            sum+=arr[end];

            while (sum>mxSum &&start<=end){
               sum=sum-arr[start];
               start++;

            }
            if (sum<=mxSum){
                count = Math.max(count,end-start+1);
            }
            end++;

        }
        return count;
    }


}
