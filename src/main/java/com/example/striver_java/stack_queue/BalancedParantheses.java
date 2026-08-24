package com.example.striver_java.stack_queue;

import java.util.Stack;

public class BalancedParantheses {

    public boolean solve(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.empty()) return false;
                char ch = stack.peek();
                stack.pop();

                if(ch == '(' && s.charAt(i) != ')'){
                    return false;
                }
                else if(ch == '[' && s.charAt(i) != ']'){
                    return false;
                }
                else if(ch == '{' && s.charAt(i) != '}'){
                    return false;
                }
            }
        }
        return stack.empty();



    }
    public static void main(String[] args) {

    }
}
