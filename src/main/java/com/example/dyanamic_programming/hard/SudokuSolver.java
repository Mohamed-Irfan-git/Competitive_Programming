package com.example.dyanamic_programming.hard;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if(solved(board)) {
            display(board);
        }
        else {
            System.out.println("Cannot solve board");
        }
    }
    public static boolean solved(int [][] board){
        int n = board.length;
        int row =-1;
        int col = -1;

        boolean emptyLeft = true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    emptyLeft = false;
                    row = i;
                    col = j;
                    break;
                }
            }
            if(emptyLeft==false){
                break;
            }
        }
        if(emptyLeft==true){
            return true;
        }

        for(int number = 1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col]=number;
                if(solved(board)){
                    return true;
                }else {
                    //backtrack if non of these value match
                    board[row][col]=0;
                }
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board,int row,int col,int number){
        for(int i=0;i<board.length;i++){
            if(board[row][i]==number){
                return false;
            }
        }
        for(int[] nums : board){
            if(nums[col]==number){
                return false;
            }
        }

        //getting sub squares details
        int sqrt = (int)Math.sqrt(board.length);//size of the box
        int rowStart =  row- row%sqrt;//starting row number
        int colStart = col- col%sqrt;//starting column number

        for(int i=rowStart;i<rowStart+sqrt;i++){
            for(int j=colStart;j<colStart+sqrt;j++){
                if(board[i][j]==number){
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
