package com.example.recursion.pattern;

public class TraianglePatterns {
    public static void main(String[] args) {
        pattern4(5);

    }

    static void pattern1(int row){
        if(row==0){
            return;
        }

        for(int i =0;i<row;i++){
            System.out.print("* ");
        }
        System.out.println();
        pattern1(row-1);

    }


    static void pattern2(int row){

        if(row==0){
            return;
        }

        pattern2(row-1);

        for(int i =0;i<row;i++){
            System.out.print("* ");
        }

        System.out.println();
    }

    static void pattern3(int row){
        if(row==0){
            return;
        }

        for(int i =0;i<row;i++){
            System.out.print(" ");
        }
        pattern3(row-1);

        for(int i =0;i<row;i++){
            System.out.print("* ");
        }
        System.out.println();
    }

    static void pattern4(int row){
        pattern4t(1,row);

    }
    private static void pattern4t(int currentRow,int totalRaw){
        if(currentRow>totalRaw){
            return;

        }
        for(int i =0;i<totalRaw-currentRow;i++){
            System.out.print(" ");
        }

        for(int i =0;i<currentRow;i++){
            System.out.print("* ");
        }


        System.out.println();
        pattern4t(currentRow+1,totalRaw);

    }
}
