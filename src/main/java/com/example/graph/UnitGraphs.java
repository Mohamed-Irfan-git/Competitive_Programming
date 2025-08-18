package com.example.graph;

import java.util.*;

public class UnitGraphs {
    public static void shortestPath(int n, int m, List<List<Integer>> graph,int source) {

        List<List<Integer>> path = new ArrayList<>();
        for(int i=0;i<n;i++) {
            path.add(new ArrayList<>());
        }

        //make here two-way connection
        for(int i=0;i<m;i++) {
            path.get(graph.get(i).get(0)).add(graph.get(i).get(1));
            path.get(graph.get(i).get(1)).add(graph.get(i).get(0));
        }

        int infinity = Integer.MAX_VALUE;

        int [] dist = new int[n];
        Arrays.fill(dist,infinity);
        dist[source]=0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while(!queue.isEmpty()) {
            int node =  queue.poll();
            for(int it:path.get(node)) {
                if(dist[node]+1 < dist[it]){
                    dist[it]=dist[node]+1;
                    queue.add(it);
                }

            }
        }

        for(int i=0;i<n;i++) {
            if(dist[i]==infinity) {
                dist[i]=-1;
            }
        }
        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int n = 6; // number of nodes
        int m = 7; // number of edges

        // Edge list: each sublist = [u, v]
        List<List<Integer>> graph = new ArrayList<>();
        graph.add(Arrays.asList(0, 1));
        graph.add(Arrays.asList(0, 2));
        graph.add(Arrays.asList(1, 3));
        graph.add(Arrays.asList(2, 3));
        graph.add(Arrays.asList(3, 4));
        graph.add(Arrays.asList(4, 5));
        graph.add(Arrays.asList(1, 5));

        int source = 0;

        shortestPath(n, m, graph, source);

    }
}
