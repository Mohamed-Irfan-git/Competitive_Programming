package com.example.dyanamic_programming;

public class Permutation {
    public static void main(String[] args) {
        permutation("","abc");
    }
    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        int size =p.length()+1;

        for(int i=0;i<size;i++){
            String p1 = p.substring(0,i);
            String p2 = p.substring(i);
            permutation(p1+ch+p2,up.substring(1));
        }
    }
}
