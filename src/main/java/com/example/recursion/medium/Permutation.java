package com.example.recursion.medium;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
//        permutation("","1587");
//        System.out.println( permutationCount("","1587"));
        String up = "abc";
        char[] chars = up.toCharArray();
        perm(chars, 0);

    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        int size = p.length()+1;

        for(int i=0; i< size;i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            permutation(f+ch+s,up.substring(1));
        }
    }

    static int permutationCount(String p,String up){
        if(up.isEmpty()){
          return 1;
        }

        int count =0;
        char ch = up.charAt(0);
        int size = p.length()+1;

        for(int i=0; i< size;i++){
            String f = p.substring(0,i);
            String s = p.substring(i);
            count =count+permutationCount(f+ch+s,up.substring(1));
        }
        return count;
    }

    static void perm(char [] up,int index ){
        if(index == up.length){
            System.out.println(Arrays.toString(up));
            return;
        }

        for(int i=index; i<up.length;i++){
            swap(up,index,i);
            perm(up,index+1);
            swap(up,index,i);
        }
    }

    static void swap(char [] up,int i,int j){
        char temp = up[i];
        up[i] = up[j];
        up[j] = temp;
    }

}
