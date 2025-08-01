package com.example.string.medium;

import java.util.ArrayList;

public class PermutationContain {
    public static void main(String[] args) {
        ArrayList<String> list = permuteUnique("","ab");
        String a = "eidbaooo";
        for(String str :list){
            if(a.contains(str)){
                System.out.println(true);
                break;
            }
        }

    }
    public static ArrayList<String> permuteUnique(String p,String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        char ch = up.charAt(0);
        int size = p.length()+1;

        for(int i=0;i<size;i++){
            String p1 = p.substring(i);
            String p2 = p.substring(0,i);
            ArrayList<String> per= permuteUnique(p1+ch+p2,up.substring(1));
            list.addAll(per);

        }
        return list;

    }
}
