package com.example.graph.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {


    }
    public static void topoSort(int v, ArrayList<ArrayList<Integer>> board, Stack<Integer> stack ,boolean[] visited) {
        visited[v] = true;
        for(int i : board.get(v)) {
            if(!visited[i]){
                topoSort(i,board,stack,visited);
            }
        }
        stack.push(v);

    }

    public static void topo(int source,ArrayList<ArrayList<Integer>> board){
        int v = board.size();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[v];

        for(int i=0;i<=v;i++){
            if(!visited[i]){
                topoSort(i,board,stack,visited);
            }
        }

        int [] dist = new int[v];
        int index = 0;
        while(!stack.isEmpty()){
            dist[index++] = stack.pop();
        }
        System.out.println(Arrays.toString(dist));

    }
}
