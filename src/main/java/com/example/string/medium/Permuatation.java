package com.example.string.medium;

public class Permuatation {
    public static void main(String[] args) {
        permu("","123");

    }
    public static String permu(String p,String up){
        if(up.isEmpty()){

            return p;
        }

        char ch = up.charAt(0);
        int size = p.length()+1;


        String s ="";
        for(int i=0;i<size;i++){
            String a = p.substring(i);
            String b =p.substring(0,i);
            s= permu(b+ch+a,up.substring(1));
        }
        return s;
    }
}
