package com.example.recursion.sort;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        reverseStack(stack);

    }
    static void reverseStack(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int top = stack.pop();
        reverseStack(stack);
        insert(stack,top);
        System.out.println(stack);



    }
    static void insert(Stack<Integer> stack,int top){
        if(stack.isEmpty()){
            stack.push(top);
            return;
        }

        int p = stack.pop();
        insert(stack,top);
        stack.push(p);
    }
}
