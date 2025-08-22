package com.example.dyanamic_programming;

import com.example.graph.DAGShortestPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DAGS {
    public static class Edge{

        int node;
        int weight;
        public Edge(int node, int weight){
            this.node = node;
            this.weight = weight;
        }

    }

    public static void topoSort(int v , List<List<Edge>> graph, Stack<Integer> stack, boolean [] visited) {
        visited[v] = true;
        for(Edge key : graph.get(v)) {
            if(!visited[key.node]) {
                topoSort(key.node,graph,stack,visited);
            }
        }
        stack.push(v);
    }

    public static void topoHelper(int source,List<List<Edge>> graph) {
        int v = graph.size();
        System.out.println(v);
        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<v;i++) {
            if(!visited[i]) {
                topoSort(i,graph,stack,visited);
            }
        }

        int [] topo = new int[v];
        Arrays.fill(topo,Integer.MAX_VALUE);
        topo[source] = 0;
        System.out.println(stack);

        while(!stack.isEmpty()) {
            int node = stack.pop();
            if(topo[node] != Integer.MAX_VALUE) {
                for(Edge edge : graph.get(node)) {
                  if(topo[edge.node] > topo[node] + edge.weight) {
                      topo[edge.node] = topo[node] + edge.weight;
                  }
                }
            }

        }
        System.out.println(Arrays.toString(topo));

    }

    public static void main(String[] args) {
        int V = 6; // Number of vertices
        List<List<Edge>> graph = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (u -> v, weight)
        graph.get(0).add(new Edge(1, 5));
        graph.get(0).add(new Edge(2, 3));
        graph.get(1).add(new Edge(3, 6));
        graph.get(1).add(new Edge(2, 2));
        graph.get(2).add(new Edge(4, 4));
        graph.get(2).add(new Edge(5, 2));
        graph.get(2).add(new Edge(3, 7));
        graph.get(3).add(new Edge(4, -1));
        graph.get(4).add(new Edge(5, -2));

        // Run shortest path algorithm
        topoHelper(0,graph);
    }
}
