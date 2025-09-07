package com.example.bitmanipulation.easy;

/*
*intuition is go to that bit place put 1
* and make other position as a zero
* once done this step do and operation
 */
public class SetCheck {
    public static void main(String[] args) {
        System.out.println(bitCheck(13,1));

    }
    static boolean bitCheck(int n,int i){
        return (n &(1<<i))!=0;

    }
}
