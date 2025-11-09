package com.example.graph.patterns;


import java.util.*;

public class Khans {
    public static void main(String[] args) {

    }
    public static void khansAlgorithm(int V , List<List<Integer>> adj) {
        int [] dist = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);

       for(int i = 0; i < V; i++){
           for(Integer e: adj.get(i)){
               dist[e] = dist[e]+1;
           }
       }

       Queue<Integer> q = new LinkedList<>();
       for(int i = 0; i < V; i++){
           if(dist[i]==0){
               q.offer(i);
           }
       }

       ArrayList<Integer> ans = new ArrayList<>();
       while(!q.isEmpty()){
           int u = q.poll();
           ans.add(u);
           for(Integer i: adj.get(u)){
               dist[i] = dist[i]-1;
               if(dist[i]==0){
                   q.offer(i);
               }
           }
       }
        System.out.println(Arrays.toString(dist));


    }
}
