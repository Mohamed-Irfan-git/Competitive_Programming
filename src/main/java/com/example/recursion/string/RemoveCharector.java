package com.example.recursion.string;

public class RemoveCharector {
    public static void main(String[] args) {
//        removeCharacter("","irfaaan");
//        System.out.println(removeCharacter("Kbaliliba"));
        System.out.println(skip("bdappledgrappyy"));
    }
    public static void removeCharacter(String s,String str) {
        if(str.isEmpty()){
            System.out.println(s);
            return;
        }
        String ch = String.valueOf(str.charAt(0));

        if(ch.equalsIgnoreCase("a")){
            removeCharacter(s,str.substring(1));
        }
        else{
            s = s+ch;
            removeCharacter(s,str.substring(1));
        }

    }

    public static String removeCharector(String str) {
        if(str.isEmpty()){
            return "";
        }
        String ch = String.valueOf(str.charAt(0));

        if(ch.equalsIgnoreCase("a")){
           return removeCharector(str.substring(1));
        }
        return ch+ removeCharector(str.substring(1));

    }
    public static String skip(String str) {
        if(str.isEmpty()){
            return "";
        }

        if(str.startsWith("app") && !str.startsWith("apple")){
            return skip(str.substring(3));
        }
        else{
            return str.charAt(0)+ skip(str.substring(1));
        }


    }
}
