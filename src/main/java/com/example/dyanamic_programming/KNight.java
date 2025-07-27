package com.example.dyanamic_programming;

public class KNight {
    public static void main(String[] args) {
        int n=4;
        boolean [][] board = new boolean [n][n];
        knight(board,0,0,4);

    }
    public static void knight(boolean[][] board,int row,int col,int knight){
        if(knight==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length){
            return;
        }

        if(col==board.length){
            knight(board,row+1,0,knight);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            knight(board,row,col+1,knight-1);
            board[row][col]=false;
        }

        knight(board,row,col+1,knight);



    }
    private static void display(boolean[][] board){
        for(boolean [] rows :board){
            for (boolean element : rows){
                if(element){
                    System.out.print(" K ");
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
        if(isVerify(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isVerify(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }

        }
        if(isVerify(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }if(isVerify(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return  true;

    }
    private static boolean isVerify(boolean[][] board,int row,int col){
        if(row>=0 && row<board.length && col>=0 && col<board[0].length){
            return true;
        }
        return false;
    }
}
