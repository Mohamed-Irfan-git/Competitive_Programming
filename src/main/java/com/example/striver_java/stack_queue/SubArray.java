package com.example.striver_java.stack_queue;

import java.util.Stack;

public class SubArray {
    // this brute force but this is work for small constraints

//    int sumSubarrayMins(int [] arr) {
//        int sum =0;
//        int n = arr.length;
//        for(int i=0;i<n;i++){
//            int min = Integer.MAX_VALUE;
//            for (int j =i;j<n;j++){
//                min = Math.min(min,arr[i]);
//                sum+=min;
//            }
//
//        }
//        return sum;
//    }
    int sumSubarrayMins(int [] arr) {
        int sum =0;
        int mod = (int)1e9 +7;
        int n = arr.length;
        int [] ns = new int[n];
        int [] ps = new int[n];

        Stack<Integer> next = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while (!next.empty() && arr[next.peek()] >= arr[i]) next.pop();

            ns[i] = next.empty() ? n : next.peek();
            next.push(i);
        }


        Stack<Integer> prev = new Stack<>();
        for(int i =0;i<n;i++){
            while (!prev.empty() && arr[prev.peek()] > arr[i]) prev.pop();

            ps[i] = prev.empty() ? -1 : prev.peek();
            prev.push(i);
        }


        for(int i =0;i<n;i++){
            sum+= (arr[i] * i-ps[i] * ns[i]-i) % mod;
        }


        return sum;
    }

    public long subArrayRanges(int[] arr) {
//        int n = nums.length;
//        int sum = 0;
//        for(int i=0;i<n;i++){
//            int small = Integer.MAX_VALUE;
//            int large = Integer.MIN_VALUE;
//            for(int j=i;j<n;j++){
//                small = Math.min(small,nums[j]);
//                large = Math.max(large,nums[j]);
//
//                sum+=large-small;
//            }
//        }
//
//        return sum;

        long sumMin =0;
        long sumMax= 0;

        int n = arr.length;
        int [] ns = new int[n];
        int [] ps = new int[n];
        int [] pg = new int[n];
        int [] ng = new int[n];

        Stack<Integer> next = new Stack<>();
        for(int i =n-1;i>=0;i--){
            while (!next.empty() && arr[next.peek()] >= arr[i]) next.pop();

            ns[i] = next.empty() ? n : next.peek();
            next.push(i);
        }


        Stack<Integer> prev = new Stack<>();
        for(int i =0;i<n;i++){
            while (!prev.empty() && arr[prev.peek()] > arr[i]) prev.pop();

            ps[i] = prev.empty() ? -1 : prev.peek();
            prev.push(i);
        }

        next.clear();
        prev.clear();


        for(int i =n-1;i>=0;i--){
            while (!next.empty() && arr[next.peek()] <= arr[i]) next.pop();

            ng[i] = next.empty() ? n : next.peek();
            next.push(i);
        }

        for(int i =0;i<n;i++){
            while (!prev.empty() && arr[prev.peek()] < arr[i]) prev.pop();

            pg[i] = prev.empty() ? -1 : prev.peek();
            prev.push(i);
        }



        for(int i =0;i<n;i++){
            sumMin=  sumMin + ((long) arr[i] * (i- ps[i] )* (ns[i]-i));
            sumMax = sumMax + ((long) arr[i] * (i - pg[i] )* (ng[i] -i));
        }


        return sumMax -sumMin;


    }


    public static void main(String[] args) {

    }
}
