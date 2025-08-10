package com.example.recursion.easy;

import java.util.HashMap;

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

    private static int fiboMemo(int n){
        HashMap<Integer, Integer> memo = new HashMap<>();
        return fib(n,memo);

    }
    private static int fib(int n,HashMap<Integer,Integer> map){
        if(n<2){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result = fib(n-1,map)+fib(n-2,map);
        map.put(n,result);
        return result;
    }

    private static int tribonoc(int n){
        return tri(n,new HashMap<>());
    }
    private static int tri(int n,HashMap<Integer,Integer> map){
        if(n<3){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result = tri(n-1,map)+tri(n-2,map)+tri(n-3,map);
        map.put(n,result);
        return result;
    }
}
