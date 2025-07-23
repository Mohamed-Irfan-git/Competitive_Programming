package com.example.tree.segment_tre;

public class Main {
    public static void main(String[] args) {
        int[]arr = {3,8,7,6,-2,-8,4,9};
        SegmentTree segmentTree = new SegmentTree(arr);
//        System.out.println(segmentTree.query(2,6));
        System.out.println(segmentTree.update(2,10));
    }
}
