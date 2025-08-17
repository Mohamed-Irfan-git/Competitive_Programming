package com.example.graph;

import java.util.*;



public class DijkstraAlgorithm {
    static class Edge {
        int to, weight;
        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }
    }
    public static void dijkstra(int V, List<List<Edge>> graph, int source) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{source, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int nodeDist = curr[1];

            if (nodeDist > dist[node]) continue;

            for (Edge edge : graph.get(node)) {
                if (dist[node] + edge.weight < dist[edge.to]) {
                    dist[edge.to] = dist[node] + edge.weight;
                    pq.offer(new int[]{edge.to, dist[edge.to]});
                }
            }
        }

        System.out.println("Shortest distances from source " + source + ":");
        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        int V = 4;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());

        // add edges
        graph.get(0).add(new Edge(1, 5));
        graph.get(0).add(new Edge(2, 3));
        graph.get(1).add(new Edge(2, 2));
        graph.get(1).add(new Edge(3, 6));
        graph.get(2).add(new Edge(3, 4));

        dijkstra(V, graph, 0);
    }
}
