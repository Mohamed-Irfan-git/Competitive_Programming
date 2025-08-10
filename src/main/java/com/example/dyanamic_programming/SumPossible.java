package com.example.dyanamic_programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SumPossible {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(5);
        a.add(6);

        System.out.println(possible(4,a,new HashMap<>()));

    }
    public static boolean possible(int amount, List<Integer> nums, HashMap<Integer,Boolean> map){
        if(amount == 0){
            return true;
        }
        if(amount < 0){
            return false;
        }
        if(map.containsKey(amount)){
            return map.get(amount);
        }

        for(int num : nums){
            int subAmount = amount-num;
            if(possible(subAmount,nums,map)){
                map.put(amount,true);
                return true;
            }

        }
        map.put(amount,false);
        return false;
    }
}
