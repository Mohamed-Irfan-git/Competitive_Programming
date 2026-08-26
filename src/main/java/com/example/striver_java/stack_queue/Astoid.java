package com.example.striver_java.stack_queue;

import java.util.Stack;

public class Astoid {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(Integer a : asteroids){
            if(a > 0){
                stack.push(a);
            }
            else{
                while (!stack.empty() && stack.peek() < -a){
                    stack.pop();
                }

                if(stack.empty() || stack.peek() < 0){
                    stack.push(a);
                }

                if(!stack.empty() && stack.peek() == -a){
                    stack.pop();
                }
            }
        }

        int n = stack.size();
        int [] ans = new int[n];
        int index = n-1;
        while (!stack.empty()){
            ans[index] = stack.peek();
            stack.pop();
            index--;
        }

        return ans;
    }
}
