package com.example.graph.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
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


    static void helper(int source,ArrayList<ArrayList<Integer>> graph){
        boolean[] visited = new boolean[graph.size()];
        visited[source] = true;
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer>path = new ArrayList<>();

        queue.offer(source);
        while(!queue.isEmpty()) {
            int node = queue.poll();
            path.add(node);
           for(Integer i : graph.get(node)) {
               if(!visited[i]) {
                   visited[i] = true;
                   queue.offer(i);
               }
           }
        }
        System.out.println(path);
        System.out.println(Arrays.toString(visited));

    }
}
