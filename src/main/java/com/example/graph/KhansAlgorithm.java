package com.example.graph;

import java.util.*;

public class KhansAlgorithm {
    //this is a BFS method
    public static void khansAlgorithm(int v, List<List<Integer>> graph) {
        int [] inDegree = new int[v];
        Arrays.fill(inDegree, 0);

        //in here we calculate the inDegree
        for(int i=0;i<v;i++){
            for(int it : graph.get(i)){
                inDegree[it]=inDegree[it]+1;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<v;i++){
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }

        List<Integer> topo = new ArrayList<>();
        int count = 0;

        //O(v+E)
        while(!queue.isEmpty()){
            int node = queue.peek();
            queue.poll();
            topo.add(node);
            count++;


            for(int i:graph.get(node)){
                inDegree[i]--;
                if(inDegree[i]==0){
                    queue.offer(i);
                }
            }
        }
        System.out.println(topo);

        if(count!=v){
            System.out.println("There has a cycle");
        }
        else{
            System.out.println("There has no detected");
        }

    }
    public static void main(String[] args) {
        int v = 6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) graph.add(new ArrayList<>());

        // Example DAG edges
        graph.get(5).add(2);
        graph.get(5).add(0);
        graph.get(4).add(0);
        graph.get(4).add(1);
        graph.get(2).add(3);
        graph.get(3).add(1);
//        graph.get(1).add(5); if this will create cycle and we can confirm there is cycle or not
        // just use count variable

        khansAlgorithm(v, graph);

        int numCourses = 6;
        // adjacency matrix representation
        int[][] prerequisites = {
                {0, 1, 1, 0, 0, 0}, // 0 -> 1, 0 -> 2
                {0, 0, 0, 1, 1, 0}, // 1 -> 3, 1 -> 4
                {0, 0, 0, 1, 0, 0}, // 2 -> 3
                {0, 0, 0, 0, 0, 1}, // 3 -> 5
                {0, 0, 0, 0, 0, 1}, // 4 -> 5
                {0, 0, 0, 0, 0, 0}  // 5
        };
        System.out.println(canFinish(v, prerequisites));



    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {

        int [] inDegree = new int[numCourses];
        Arrays.fill(inDegree, 0);

        ArrayList<ArrayList<Integer>>  graph = new ArrayList<>();

        for(int i =0;i<numCourses;i++){
            graph.add(new ArrayList<>());
        }

        // Step 1: Calculate in-degree for each node
        for (int i = 0; i < numCourses; i++) {
           int course = inDegree[0];
           int prereq = inDegree[1];
           graph.get(course).add(prereq);
           inDegree[prereq]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDegree[i]==0){
                queue.offer(i);
            }
        }
        List<Integer> topo = new ArrayList<>();
        int count = 0;

        while(!queue.isEmpty()){
            int node = queue.poll();
            topo.add(node);
            count++;
            // Decrease in-degree of adjacent nodes
            //node mean is row j mean column
            for (int j = 0; j < numCourses; j++) {
                if (prerequisites[node][j] == 1) {
                    inDegree[j]--;
                    if (inDegree[j] == 0) {
                        queue.offer(j);
                    }
                }
            }

        }
        return count == numCourses;
    }


}
