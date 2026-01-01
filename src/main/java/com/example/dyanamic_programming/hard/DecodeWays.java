package com.example.dyanamic_programming.hard;

import java.util.Arrays;

public class DecodeWays {
    public static void main(String[] args) {
        int index = 0;
        String str = "12";
        String path = "";
        int [] dp = new int[str.length()];
        Arrays.fill(dp, -1);
        decodeWay(index,str,path);

    }
    static void decodeWay(int index,String str,String path){
        if(index == str.length()){
            System.out.println(path);
            return;
        }

        if(str.charAt(index) != '0'){
            int val = 'A' + (str.charAt(index) - '0')-1;
            char ch = (char) val;
            decodeWay(index+1,str,path+ch);
        }

        if(index + 1 < str.length() && str.charAt(index) != '0'){
            int val = (str.charAt(index) - '0')*10 + str.charAt(index + 1) - '0';
            if(val>=10 && val<=26){
                int val2 = 'A' + val -1;
                char ch = (char) val2;
                decodeWay(index+2,str,path+ch);
            }
        }
    }


}
