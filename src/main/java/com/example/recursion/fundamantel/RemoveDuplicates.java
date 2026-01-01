package com.example.recursion.fundamantel;

public class RemoveDuplicates {
    public static void main(String[] args) {
        subSequenceBinary("",3);

    }
    static void removeDuplicates(String p , String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if(p.indexOf(ch) == -1){
            p +=ch;
        }
        removeDuplicates(p,up.substring(1));
    }

    static void subSequence(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subSequence(p+ch,up.substring(1));
        subSequence(p,up.substring(1));
    }


    static void subSequenceBinary(String p , int n){


        if(p.length() == n){
            System.out.println(p);
            return;
        }

        subSequenceBinary(p+"0",n);

        if(p.isEmpty() || p.charAt(p.length()-1) != '1'){
            subSequenceBinary(p+"1",n);
        }


    }
}
