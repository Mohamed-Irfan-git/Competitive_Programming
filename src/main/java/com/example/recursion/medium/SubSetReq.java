package com.example.recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class SubSetReq {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(subSeqRet(arr));

    }
    public static List<List<Integer>> subSeqRet(int[] arr){
        return helper(arr,0);
    }
    public static List<List<Integer>> helper(int[] arr,int  index){
        if(index==arr.length){
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>());
            return  list;
        }
        int current = arr[index];
        List<List<Integer>> list = helper(arr,index+1);
        List<List<Integer>> result = new ArrayList<>(list);

        for(List<Integer> subList : list){
            List<Integer> newList = new ArrayList<>(subList);
            newList.add(current);
            result.add(newList);
        }
        return result;
    }
}
