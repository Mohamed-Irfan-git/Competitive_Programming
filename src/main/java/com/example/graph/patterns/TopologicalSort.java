package com.example.graph.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int n = 6; // number of nodes
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);
        graph.get(3).add(4);
        graph.get(4).add(5);
        graph.get(5).add(6);

        topo(graph);



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

    public static void topo(ArrayList<ArrayList<Integer>> board){
        int v = board.size();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[v];

        for(int i=1;i< v;i++){
            if(!visited[i]){
                topoSort(i,board,stack,visited);
            }
        }

        int [] dist = new int[v-1];
        int index = 0;
        while(!stack.isEmpty()){
            dist[index++] = stack.pop();
        }
        System.out.println(Arrays.toString(dist));

    }
}
