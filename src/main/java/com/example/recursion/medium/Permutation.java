package com.example.recursion.medium;

public class Permutation {
    public static void main(String[] args) {
        permutation("","1587");
        System.out.println( permutationCount("","1587"));


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
}
