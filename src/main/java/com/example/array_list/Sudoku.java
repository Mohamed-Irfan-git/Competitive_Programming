package com.example.array_list;

public class Sudoku {
    public static void main(String[] args) {
        char ch = (char)(5+'0');
        System.out.println((int)ch);
        char[][] sudo = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        solveSudoku(sudo);

        for(char[] row : sudo) {
            for(char c : row) {
                System.out.print(c+" ");
            }
            System.out.println();
        }

    }
    public static void solveSudoku(char[][] board) {
        solver(board);
    }
    private static  boolean solver(char[][] board) {
        int len = board.length;
        int row = -1;
        int col = -1;

        boolean flag = true;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if(board[i][j] == '.') {
                    row = i;
                    col = j;
                    flag = false;
                    break;
                }

            }
            if(flag==false){
                break;
            }
        }
        if(flag == true){
            return true;
        }
        for(int number =1;number<=9;number++){
          if(isSafe(row,col,number,board)){
              board[row][col] =(char) (number+'0');
              if(solver(board)){
                  return true;
              }
              else{
                  board[row][col] ='.';
              }
          }
        }
        return false;
    }

    private static boolean isSafe(int row, int col, int number, char[][] board){
        char numChar = (char) (number+'0');
        for(int i = 0;i<9;i++){
            if(board[i][col]==numChar){
                return false;
            }
        }

        for(int i = 0;i<9;i++){
            if(board[row][i]==numChar){
                return false;
            }
        }




        int sqrt = (int)Math.sqrt(board.length);
        int rowStart = row-row%sqrt;
        int colStart = col-col%sqrt;

        for(int i = rowStart;i<rowStart+sqrt;i++){
            for(int j = colStart;j<colStart+sqrt;j++){
                if(board[i][j]==numChar){
                    return false;
                }
            }
        }
        return true;
    }



}
