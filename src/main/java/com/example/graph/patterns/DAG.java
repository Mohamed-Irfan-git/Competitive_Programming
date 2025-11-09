package com.example.graph.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DAG {
    public static void main(String[] args) {

    }
    public static void topologicalSort(List<List<Integer>> graph,boolean[] visited,int v,Stack<Integer> stack) {
        visited[v]=true;
        for(int node : graph.get(v)) {
            if(!visited[node]) {
                topologicalSort(graph,visited,node,stack);
            }
        }
        stack.push(v);
    }
    public static void topoSort(int source,List<List<Integer>> graph) {
        int v = graph.size();
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<v;i++) {
            if(!visited[i]) {
                topologicalSort(graph,visited,i,stack);
            }
        }

        int [] dist = new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        ArrayList<Integer> list = new ArrayList<>();

        while(!stack.isEmpty()) {
            int node = stack.pop();
            if(dist[node]==Integer.MAX_VALUE) {
                for(int i : graph.get(node)) {

                    // we need to create edges so we will do further delay

                }
            }
        }

    }
}
