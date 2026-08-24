package com.example.striver_java.stack_queue;

import java.util.Arrays;
import java.util.Stack;

public class NextSmallerElement {
    int [] nextSmallerElements(int [] nums){
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        int [] ns = new int[n];

        for(int i=n-1;i>=0;i--){
            while(!stack.empty() && stack.peek() >= nums[i]){
                stack.pop();
            }

            if(stack.empty()){
                ns[i] = -1;
            }
            else {
                ns[i] = stack.peek();
            }
            stack.push(nums[i]);
        }

        return ns;
    }

    public static void main(String[] args) {
        NextSmallerElement ns = new NextSmallerElement();
        int [] arr = ns.nextSmallerElements(new int[]{1,3,4,2});
        System.out.println(Arrays.toString(arr));
    }
}
