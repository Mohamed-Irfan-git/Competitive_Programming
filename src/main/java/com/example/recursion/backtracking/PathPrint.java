package com.example.recursion.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PathPrint {
    public static void main(String[] args) {
//        path("",3,3);
        List<String> arr=pathDiagonal("",3,3);
//        System.out.println(arr);
        System.out.println(arr);



    }
    static void path(String p,int row,int col){
        if(row==1 && col==1){
            System.out.println(p);
            return;
        }
        if(row>1){
            path(p+"D",row-1,col);
        }
        if(col>1){
            path(p+"R",row,col-1);
        }
    }

    static List<String> pathAll(String p, int row, int col){
        if(row==1 && col==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(row>1){
            list.addAll(pathAll(p+"D",row-1,col));
        }
        if(col>1){
            list.addAll(pathAll(p+"R",row,col-1));
        }
        return list;
    }
    static List<String> pathDiagonal(String p, int row, int col){
        if(row==1 && col==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        if(row>1 && col>1){
            list.addAll(pathDiagonal(p+"D",row-1,col-1));
        }
        if(row>1){
            list.addAll(pathDiagonal(p+"V",row-1,col));
        }
        if(col>1){
            list.addAll(pathDiagonal(p+"H",row,col-1));
        }
        return list;
    }




}
