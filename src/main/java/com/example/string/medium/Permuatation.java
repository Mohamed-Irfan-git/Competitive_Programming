package com.example.string.medium;

public class Permuatation {
    public static void main(String[] args) {
        boolean [] seen = new boolean[3];
        permutate("","123",seen);

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

    public static void permutate(String p,String up, boolean [] seen){
        if(p.length() == up.length() ){
            System.out.println(p);
            return;
        }

        for(int i = 0; i < up.length();i++){
            if(!seen[i]){
                seen[i] = true;
                char t = up.charAt(i);
                permutate(p+t,up,seen);
                seen[i] = false;
            }
        }
    }
}
