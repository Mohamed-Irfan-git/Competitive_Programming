package com.example.binary_search;

import java.util.PriorityQueue;

public class GasStation {
    public static void main(String[] args) {
        int [] arr = {1,2,8};
        int n = 1;
        System.out.println(maximumDistanceOfMinimumGasStation(arr,n));  // 3.0
    }

    static double maximumDistanceOfMinimumGasStation(int [] station, int k){
        int n = station.length;
        int [] howMany = new int[n-1];

        PriorityQueue<double[]> pq = new PriorityQueue<>(
                (a,b) -> Double.compare(b[0], a[0])  // max-heap
        );

        // initialize heap with original gaps
        for(int i=0;i<n-1;i++){
            double dis = station[i+1] - station[i];
            pq.offer(new double[]{dis, i});
        }

        // place k new stations
        for(int i =0; i< k;i++){
            double[] top = pq.poll();
            int index = (int) top[1];

            howMany[index]++;
            double gap = station[index+1] - station[index];
            double newDis = gap / (howMany[index] +1);

            pq.offer(new double[]{newDis, index});
        }

        return pq.peek()[0];
    }
}
