package com.example.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class Aschii {
    public static void main(String[] args) {
        aschii("","abc");
        System.out.println(aschiiRet("","23"));
    }
    static void aschii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        aschii(p+ch,up.substring(1));
        aschii(p+(ch+0),up.substring(1));
        aschii(p,up.substring(1));
    }

    static List<String> aschiiRet(String p, String up){
        if(up.isEmpty()){
            List<String> ret = new ArrayList<>();
            ret.add(p);
            return ret;
        }

        char ch = up.charAt(0);

        List<String> right= aschiiRet(p+ch,up.substring(1));
        List<String> mid= aschiiRet(p+(ch+0),up.substring(1));
        List<String> left= aschiiRet(p,up.substring(1));

        right.addAll(left);
        right.addAll(mid);


        return right;


    }
}
