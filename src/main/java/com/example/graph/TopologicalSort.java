package com.example.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
this is only work for DAG (directed acyclic graph)
this is topological sort it's only need when we try to solve dag question
stack , visited array is the main part of this code
 */
public class TopologicalSort {
    public static void topoSort(int v, boolean[] visited, Stack<Integer> stack, List<List<Integer>> graph) {
        visited[v] = true;
        for(Integer i : graph.get(v)) {
            if (!visited[i]) {
                topoSort(i, visited, stack, graph);
            }
        }
        stack.push(v);
    }

    public static void sort(List<List<Integer>> graph) {
        int v = graph.size();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[v];

       for(int i=0;i<v;i++) {
           if(!visited[i]) {
               topoSort(i, visited, stack, graph);
           }
       }
       int[] dist = new int[v];
       int index = 0;
       while(!stack.isEmpty()) {
           dist[index++] = stack.pop();

       }
        System.out.println(Arrays.toString(dist));


    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int v = 6;

        for(int i=0;i<=v;i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(4).add(0);
        graph.get(6).add(4);
        graph.get(1).add(3);
        graph.get(2).add(3);
        graph.get(6).add(5);
        graph.get(4).add(2);
        graph.get(5).add(4);

        sort(graph);

    }
}
