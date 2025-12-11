package com.example.recursion.backtracking;


import java.util.Arrays;

public class MazePrint {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        int[][] path = new int[maze.length][maze[0].length];
//        upMaze("",3,3);
        someObs("",maze, 0,0);
//        path("",maze,0,0,path,1);

    }
    public static void maze(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>0){
            maze(p+"D",row-1,col);
        }
        if(col>0){
            maze(p+"R",row,col-1);
        }
    }

    public static void upMaze(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
        }
        if(row>1 && col>1){
            upMaze(p+"V",row-1,col-1);
        }
        if(row>1){
            maze(p+"D",row-1,col);
        }
        if(col>1){
            maze(p+"R",row,col-1);
        }
    }
    public static void someObs(String p ,boolean[][] maze,int row,int col){
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[row][col]){
            return;
        }
        maze[row][col]=false;

        if(row<maze.length-1 ){
            someObs(p+"D",maze,row+1,col);
        }
        if(col<maze[0].length-1 ){
            someObs(p+"R",maze,row,col+1);
        }
        if(row>0){
            someObs(p+"U",maze,row-1,col);
        }
        if(col>0){
            someObs(p+"L",maze,row,col-1);
        }

        maze[row][col]=true;

    }

    public static void path(String p,boolean[][] maze,int row,int col,int [][] path ,int step){
        if(row==maze.length-1 && col==maze[0].length-1){
            path[row][col]=step;
           for(int [] arr : path){
               System.out.println(Arrays.toString(arr));
           }
           System.out.println(p);
           System.out.println();
           return;
        }

        if(!maze[row][col]){
            return;
        }
        path[row][col]=step;
        maze[row][col]=false;

        if(row<maze.length-1 ){
            path(p+"D",maze,row+1,col,path,step+1);
        }
        if(col<maze[0].length-1 ){
            path(p+"R",maze,row,col+1,path,step+1);
        }
        if(row>0){
            path(p+"U",maze,row-1,col,path,step+1);
        }
        if(col>0){
            path(p+"L",maze,row,col-1,path,step+1);
        }

        maze[row][col]=true;
        path[row][col]=0;

    }


}
