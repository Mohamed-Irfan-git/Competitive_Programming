package com.example.dyanamic_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopoSort {
    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int noOfnodes = 5;

        for(int i=0;i<=noOfnodes;i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(5).add(0);
        graph.get(5).add(2);
        graph.get(2).add(3);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(3).add(1);

        topoHelper(noOfnodes,graph);

    }
    public static void topoSort(int v , List<List<Integer>> graph, Stack<Integer> stack,boolean [] visited) {
        visited[v] = true;
        for(int key : graph.get(v)) {
            if(!visited[key]) {
                topoSort(key,graph,stack,visited);
            }
        }
        stack.push(v);
    }

    public static void topoHelper(int source,List<List<Integer>> graph) {
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
        int count = 0;
        while(!stack.isEmpty()) {
            topo[count] = stack.pop();
            count++;
        }

        System.out.println(Arrays.toString(topo));


    }
}
