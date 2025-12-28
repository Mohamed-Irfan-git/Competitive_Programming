package com.example.recursion.sort;

import java.util.Stack;

public class Sorting {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        recursive(stack);

    }
    static void sorting(Stack<Integer> stack){
        Stack <Integer> tempStack = new Stack<>();

        while(!stack.isEmpty()){
            if(tempStack.isEmpty() || stack.peek() > tempStack.peek()){
                tempStack.push(stack.pop());
            }
            else {
                int po = stack.pop();
                while(!tempStack.isEmpty()  && stack.peek() > po){
                    stack.push(tempStack.pop());
                }
                tempStack.push(po);

            }
        }

        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
        }

        System.out.println(stack);
    }

    static void recursive(Stack <Integer> stack){
        if(stack.isEmpty()){
            return;
        }

        int top = stack.pop();
        recursive(stack);
        insertStack(stack,top);
        System.out.println(stack);


    }
    static void insertStack(Stack <Integer> stack,int top){
        if(stack.isEmpty() || stack.peek() <= top){
            stack.push(top);
            return;
        }

        // in our gol is put top inside the stack after we will put the remaining element
        int p = stack.pop();
        insertStack(stack,top);

        stack.push(p);
    }
}


