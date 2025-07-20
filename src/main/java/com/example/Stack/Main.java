package com.example.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        DynamicStack stack = new DynamicStack();
        stack.push(15);
        stack.push(1);
        stack.push(19);
        stack.push(19);
        stack.push(19);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        stack.push(18);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.display();



    }
}
