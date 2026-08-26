package com.example.striver_java.stack_queue;

import java.util.Stack;

public class RemoveKDigit {
    public String removeKdigits(String num, int k) {
        int n = num.length();
        StringBuilder ans = new StringBuilder();
        int j = 0;
        while(num.charAt(j) == '0'){
            j++;
        }
        Stack<Integer> stack = new Stack<>();
        int rem = 1;
        for(int i=j;i<n;i++){
            int val = num.charAt(i) - '0';

            while(!stack.empty() && stack.peek() >= val && rem<=k){
                stack.pop();
                rem++;
            }
            stack.push(val);

        }

        while(!stack.empty()){
            ans.append(stack.peek().toString());
            stack.pop();
        }

        ans.reverse();
        j=0;
        while (j < ans.length() && ans.charAt(j) == '0') j++;
        if(j == ans.length()){
            return "0";
        }

        return ans.substring(j);

    }

}
