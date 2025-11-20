package com.example.graph.patterns;

import java.util.Arrays;

public class DFSMatrix {
    public static void main(String[] args) {
        int n = 8; // number of nodes

        // Create adjacency matrix
        int[][] graph = new int[n + 1][n + 1]; // 1-based indexing

        // Add edges
        graph[1][2] = 1;
        graph[1][3] = 1;

        graph[2][1] = 1;
        graph[2][5] = 1;
        graph[2][6] = 1;

        graph[3][1] = 1;
        graph[3][4] = 1;
        graph[3][7] = 1;

        graph[4][3] = 1;
        graph[4][7] = 1;

        graph[5][2] = 1;
        graph[6][2] = 1;

        graph[7][3] = 1;
        graph[7][8] = 1;

        graph[8][4] = 1;
        graph[8][7] = 1;

        // Call DFS helper
        helper(graph);
    }

    // DFS using adjacency matrix
    static void dfs(int node, boolean[] visited, int[][] graph) {
        visited[node] = true;

        for (int neighbor = 1; neighbor < graph.length; neighbor++) {
            if (graph[node][neighbor] == 1 && !visited[neighbor]) {
                dfs(neighbor, visited, graph);
            }
        }
    }

    // Helper function
    static void helper(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < visited.length; i++) {
            dfs(i, visited, graph);
        }

        System.out.println(Arrays.toString(visited));
    }
}
