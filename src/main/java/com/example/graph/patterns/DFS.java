package com.example.graph.patterns;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * DEPTH FIRST SEARCH this is a very important pattern
 */
public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int n = 8;
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(2).add(5);
        graph.get(2).add(6);
        graph.get(2).add(1);
        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(7);
        graph.get(4).add(3);
        graph.get(4).add(7);
        graph.get(5).add(2);
        graph.get(6).add(2);
        graph.get(7).add(3);
        graph.get(7).add(8);
        graph.get(8).add(4);
        graph.get(8).add(7);

        helper(1, graph);


    }

    static void dfs(int node , boolean[] visited, ArrayList<ArrayList<Integer>> graph) {
        visited[node] = true;

        for(Integer i: graph.get(node)) {
            if(!visited[i]) {
                dfs(i, visited, graph);
            }
        }

    }

    static void helper(int source , ArrayList<ArrayList<Integer>> graph){
        boolean[] visited = new boolean[graph.size()];
        visited[source] = true;

        for(int i: graph.get(source)) {
            if(!visited[i]) {
                dfs(i,visited,graph);
            }
        }
        System.out.println(Arrays.toString(visited));

    }
}
