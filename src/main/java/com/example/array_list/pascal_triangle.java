package com.example.array_list;

import java.util.ArrayList;

public class pascal_triangle {
    public static void main(String[] args) {
        System.out.println(generate(5));

    }
    public static ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            for (int col = 0; col <= row; col++) {
                if(col==row ||col==0){
                    currentRow.add(1);
                }
                else{
                    int val = triangle.get(row-1).get(col-1) + triangle.get(row-1).get(col);
                    currentRow.add(val);
                }
            }
            triangle.add(currentRow);
        }
        return triangle;
        
    }
}
