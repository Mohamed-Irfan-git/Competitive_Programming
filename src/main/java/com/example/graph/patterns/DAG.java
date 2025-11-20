package com.example.graph.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DAG {
    public static void main(String[] args) {
        int n=6;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 4);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);

        topoSort(1,graph);

    }
    static void addEdge(List<List<Integer>> graph,int u,int v){
        graph.get(u).add(v);

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

        for(int i=1;i<v;i++) {
            if(!visited[i]) {
                topologicalSort(graph,visited,i,stack);
            }
        }

        int [] dist = new int[v];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[source]=0;

        while(!stack.isEmpty()) {
            int u = stack.pop();
            if(dist[u]!=Integer.MAX_VALUE) {
                for(int i : graph.get(u)) {
                    if(dist[i] > dist[u]+1) {
                        dist[i] = dist[u]+1;
                    }


                }
            }
        }

        System.out.println(Arrays.toString(dist));

    }
}
