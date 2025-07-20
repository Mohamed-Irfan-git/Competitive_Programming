package com.example.recursion.backtracking;

public class pathCount {
    public static void main(String[] args) {
        System.out.println(pathCounter(3,3));
    }
    static int pathCounter(int row,int col){
       if(row==1 || col==1){
           return 1;
       }
      int right = pathCounter(row-1,col);
       int down = pathCounter(row,col-1);
       return right+down;
    }
}
