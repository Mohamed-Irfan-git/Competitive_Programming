package com.example.greedAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSequencing {
    public static class Job{
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jobSequencing(Job [] jobs){
        Arrays.sort(jobs,new Comparator<Job>(){
            @Override
            public int compare(Job job1, Job job2) {
                return job2.profit-job1.profit;
            }
        });

        int maxDeadline = 0;
        for(Job job:jobs){
            maxDeadline = Math.max(maxDeadline,job.deadline);
        }

        int [] slots = new int[maxDeadline+1];
        Arrays.fill(slots,-1);

        int totalProfit = 0;
        List<Integer> result = new ArrayList<>();
        for(Job job:jobs){
            for(int i= job.deadline;i>0;i--){
                if(slots[i]==-1){
                    slots[i] = job.id;
                    totalProfit += job.profit;
                    result.add(job.id);
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(slots));
        System.out.println("Job Schedule :" + Arrays.toString(result.toArray()));
        System.out.println("Total profit :" + totalProfit);

    }
    public static void main(String[] args) {
        Job[] jobs = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 1, 40),
                new Job(4, 1, 30)
        };
        jobSequencing(jobs);
    }
}
