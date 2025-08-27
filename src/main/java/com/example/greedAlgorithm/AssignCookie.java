package com.example.greedAlgorithm;

import java.util.Arrays;

public class AssignCookie {
    public static void main(String[] args) {
        int [] child ={1,5,3,3,4};
        int [] cookie = {4,2,1,3,2,1,5};
        System.out.println(numberOfAssign(child,cookie));

    }
    public static int numberOfAssign(int [] child,int [] cookie){
        Arrays.sort(child);
        Arrays.sort(cookie);

        int count = 0;
        int i = 0;
        int j = 0;
        while (i < child.length && j < cookie.length){
            if (child[i] <= cookie[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
