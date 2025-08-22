package com.example.dyanamic_programming;

import java.util.HashMap;

public class ClimbinStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2,new HashMap<>()));
    }
    public static int climbStairs(int n , HashMap<Integer, Integer> map) {
        if(n<=2){
            return n;
        }

        if(map.containsKey(n)){
            return map.get(n);
        }

        int result = climbStairs(n-1,map)+climbStairs(n-2,map);
        map.put(n,result);
        return result;
    }
}
