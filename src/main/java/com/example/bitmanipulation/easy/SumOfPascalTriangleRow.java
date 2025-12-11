package com.example.bitmanipulation.easy;

public class SumOfPascalTriangleRow {
    public static void main(String[] args) {
        System.out.println(pascalTriangle(10));

    }
    static int pascalTriangle(int n){
        return 1<<(n-1);
    }
}
