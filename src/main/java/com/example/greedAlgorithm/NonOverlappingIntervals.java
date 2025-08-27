package com.example.greedAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingIntervals {
    public static class Interval{
        int start;
        int end;

        public Interval(int start, int end){
            this.start = start;
            this.end = end;
        }
    }

    public static int nonOverlappingIntervals(Interval[] intervals){
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.end - o2.end;
            }
        });

        int count =0;
        int end = Integer.MIN_VALUE;

       for(Interval interval:intervals){
           if(interval.start >= end){
               count++;
               end = interval.end;
           }
       }
       return count;
    }

    public static void main(String[] args) {
        Interval[] intervals = {
                new Interval(1,3),
                new Interval(2,5),
                new Interval(4,6),
                new Interval(1,3)
        };
        System.out.println(nonOverlappingIntervals(intervals));
    }
}
