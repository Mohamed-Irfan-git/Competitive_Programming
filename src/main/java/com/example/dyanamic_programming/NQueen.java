package com.example.dyanamic_programming;

public class NQueen {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board = new boolean [n][n];
        queen(board,0);

    }
    public static void queen(boolean[][] board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return;
        }
        for (int col = 0; col < board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                queen(board,row+1);
                board[row][col]=false;
            }
        }
    }
    private static void display(boolean[][] board){
        for(boolean [] rows :board){
            for (boolean element : rows){
                if(element){
                    System.out.print(" Q ");
                }
                else{
                    System.out.print(" * ");
                }
            }
            System.out.println();
        }

    }
    private static boolean isSafe(boolean[][] board,int row,int col){
        //row check
       for(int i = 0; i < row; i++){
           if(board[i][col]){
               return false;
           }
       }



       //left check
        int leftMove = Math.min(row,col);
       for(int i = 1; i <= leftMove; i++){
           if(board[row-i][col-i]){
               return false;
           }

       }
       int rightMove = Math.min(row,board.length-col-1);
       for(int i = 1; i <= rightMove; i++){
           if(board[row-i][col+i]){
               return false;
           }
       }
       return true;

    }
}
