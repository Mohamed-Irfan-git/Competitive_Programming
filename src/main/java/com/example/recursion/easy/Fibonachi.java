package com.example.recursion.easy;

public class Fibonachi {
    public static void main(String[] args) {
        System.out.println(fiboRec(7));
       fiboInClas(7);

    }
    private static int fiboRec(int n){
        if(n<2){
            return n;
        }
        return fiboRec(n-1)+fiboRec(n-2);

    }

    private static void fiboInClas(int n){
        if(n<2){
            return;
        }
        int first = 0, second = 1;
        for(int i=2;i<n;i++){
            int temp = first + second;
            first = second;
            second = temp;
        }
        System.out.println(first+second);

    }
}
