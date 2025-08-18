package com.example.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DAGShortestPath {
    public static class Edge {
        int adjNode, weight;
        public Edge(int adjNode, int weight) {
            this.adjNode = adjNode;
            this.weight = weight;
        }
    }
    static final int INF = Integer.MAX_VALUE;

    // Topological sort (DFS)
    private static void topologicalSort(int v, boolean[] visited, Stack<Integer> stack, List<List<Edge>> graph) {
        visited[v] = true;
        for (Edge edge : graph.get(v)) {
            if (!visited[edge.adjNode]) {
                topologicalSort(edge.adjNode, visited, stack, graph);
            }
        }
        stack.push(v);
    }

    // Shortest Path in DAG
    public static void shortestPath(List<List<Edge>> graph, int source) {
        int V = graph.size();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[V];

        // Step 1: Topological Sort
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSort(i, visited, stack, graph);
            }
        }

        // Step 2: Initialize distances
        int[] dist = new int[V];
        Arrays.fill(dist, INF);
        dist[source] = 0;

        // Step 3: Relax edges in topological order
        while (!stack.isEmpty()) {
            int u = stack.pop();
            if (dist[u] != INF) {
                for (Edge edge : graph.get(u)) {
                    if (dist[edge.adjNode] > dist[u] + edge.weight) {
                        dist[edge.adjNode] = dist[u] + edge.weight;
                    }
                }
            }
        }

        // Step 4: Print shortest distances
        System.out.println("Shortest distances from source " + source + ":");
        for (int i = 0; i < V; i++) {
            if (dist[i] == INF) {
                System.out.println("Node " + i + " : INF");
            } else {
                System.out.println("Node " + i + " : " + dist[i]);
            }
        }
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
        shortestPath(graph, 0);
    }
}
