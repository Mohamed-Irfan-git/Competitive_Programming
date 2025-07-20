package com.example.recursion.pattern;

public class Traiangle {
    public static void main(String[] args) {
        triangle2(5,5);

    }
    public static void triangle(int row,int col){
        if(row==0 ){
            return;
        }
        if(row>col){
            triangle(row,col+1);
            System.out.print("* ");
        }
        else{
            triangle(row-1,0);
            System.out.println();
        }

    }
    public static void triangle2(int row,int col){
        if(row==0 ){
            return;
        }
        if(row>col){
            System.out.print("* ");
            triangle2(row,col+1);
        }
        else{
            System.out.println();
            triangle2(row-1,0);
        }

    }
}
