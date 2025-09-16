package com.example.recursion.fundamantel;

public class PrintNumbers {
    public static void main(String[] args) {
        printNumbers2(5);

    }
    /**
     * if u see the recursion tree for this can see last value pass top
     */
    static void printNumbers(int n) {
        if(n==1){
            System.out.println(n); // it will print last n only which is 1;
            return;
        }
        printNumbers(n-1);
    }

    /**
     *
     * @param n is a printNumbers1 parameter variable name
     *          value are storing in to the stack, and it will print after one by one
     *          1,2,3,4,5 order
     */
    static void printNumbers1(int n) {
        if(n==0){
            return;
        }
        printNumbers1(n-1);
        System.out.println(n);
    }

    /**
     *
     * @param n is a printNumbers2 parameter variable name
     *          value are not storing in to the stack, and it will print before every recursion call
     *          first print and after make recursive call
     */
    static void printNumbers2(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumbers2(n-1);

    }
}
