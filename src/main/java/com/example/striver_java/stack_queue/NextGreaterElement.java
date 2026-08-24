package com.example.striver_java.stack_queue;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.empty() && stack.peek() <= nums2[i]) stack.pop();

            if(stack.empty()){
                map.put(nums2[i],-1);
            }
            else{
                map.put(nums2[i],stack.peek());
            }

            stack.push(nums2[i]);
        }

        int [] ans = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }



    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int [] ans = new int[nums.length];

        for(int i=(nums.length-1)*2;i>=0;i--){
            int index = i % nums.length;

            while(!stack.empty() && stack.peek() <= nums[index]) stack.pop();

            if(i < nums.length){
                if(stack.empty()){
                    ans[i] = -1;
                }
                else{
                    ans[i] = stack.peek();
                }
            }

            stack.push(nums[index]);
        }

        return ans;
    }
}
