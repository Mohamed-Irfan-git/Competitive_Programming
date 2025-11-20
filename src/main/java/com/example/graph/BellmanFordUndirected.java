package com.example.graph;

import java.util.*;

public class BellmanFordUndirected {

    public static int[] Bellman_Ford(int V, List<int[]> edges, int source) {
        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        // Step 1: Relax edges V-1 times
        for (int i = 0; i < V - 1; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];

                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }

                // Since it's undirected, also relax the reverse edge
                if (dist[v] != Integer.MAX_VALUE && dist[v] + wt < dist[u]) {
                    dist[u] = dist[v] + wt;
                }
            }
        }

        // Step 2: Check for negative weight cycles
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int wt = edge[2];

            if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                System.out.println("Graph contains negative weight cycle");
                return null;
            }

            if (dist[v] != Integer.MAX_VALUE && dist[v] + wt < dist[u]) {
                System.out.println("Graph contains negative weight cycle");
                return null;
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int V = 5;
        List<int[]> edges = new ArrayList<>();

        // Undirected edges (just add once, code handles both directions)
        edges.add(new int[]{0, 1, -1});
        edges.add(new int[]{0, 2, 4});
        edges.add(new int[]{1, 2, 3});
        edges.add(new int[]{1, 3, 2});
        edges.add(new int[]{1, 4, 2});
        edges.add(new int[]{3, 2, 5});
        edges.add(new int[]{3, 1, 1});
        edges.add(new int[]{4, 3, -3});

        int[] dist = Bellman_Ford(V, edges, 0);

        if (dist != null) {
            System.out.println("Shortest distances from source 0: " + Arrays.toString(dist));
        }
    }
}
