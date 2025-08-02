package com.example.array_list;

import java.util.ArrayList;
import java.util.Stack;

public class pascall_tri11 {
    public static void main(String[] args) {
        System.out.println(pascal(3));

    }
    public static ArrayList<Integer> pascal(int num){
        Stack<ArrayList<Integer>> stack = new Stack<>();

        for(int row=0;row<=num;row++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int col=0;col<=row;col++){
                if (col==0 || col==row){
                    list.add(1);
                }else{
                    int val = stack.get(row-1).get(col-1)+stack.get(row-1).get(col);
                    list.add(val);
                }
            }
            stack.push(list);
        }
        return stack.pop();

    }
}
