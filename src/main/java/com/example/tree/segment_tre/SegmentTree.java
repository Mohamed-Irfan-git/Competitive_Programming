package com.example.tree.segment_tre;

public class SegmentTree {
    private static class Node {
        private int data;
        private final int startInterval;
        private final int endInterval;
        private Node left;
        private Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }

    }
    private final Node root;

    public SegmentTree(int [] arr) {
        this.root =constructor(arr,0,arr.length-1);
    }
    private Node constructor(int [] arr, int start, int end) {
        if(start == end){
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        int mid = (start+end)/2;
        Node node = new Node(start,end);
        node.left = constructor(arr,start,mid);
        node.right = constructor(arr,mid+1,end);
        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";

        if(node.left != null){
            str = str + "Interval=[ " + node.left.startInterval + "-" + node.left.endInterval + " ] and data: " + node.left.data;
        }
        else{
            str = str + "No right child";
        }

        str = str + "Interval=[ " + node.startInterval + "-" + node.endInterval + " ] and data: " + node.data + " <= ";

        if(node.right != null){
            str = str + "Interval=[ " + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        }
        else{
            str = str + "No left child";
        }

        System.out.println(str + '\n');

        if(node.left != null){
            display(node.left);
        }
        if(node.right != null){
            display(node.right);
        }

    }
    public int query(int sqi,int eqi){
        return this.query(this.root,sqi,eqi);
    }
    private int query(Node node,int sqi,int eqi){
        if(node.startInterval >= sqi && node.endInterval <= eqi){
            return node.data;
        }
        else if(node.startInterval > eqi || node.endInterval < sqi){
            return 0;
        }
        else{
            return this.query(node.left,sqi,eqi)+this.query(node.right,sqi,eqi);
        }
    }

    public int update(int index,int value){
        return this.update(this.root,index,value);
    }
    private int update(Node node,int index,int value){
       if(index>=node.startInterval && index<=node.endInterval){
           if(index==node.startInterval && index==node.endInterval){
               node.data = value;
               return node.data;
           }
           else {
               int left = this.update(node.left,index,value);
               int right = this.update(node.right,index,value);
               node.data = left + right;
               return node.data;
           }

       }
       return node.data;
    }
}