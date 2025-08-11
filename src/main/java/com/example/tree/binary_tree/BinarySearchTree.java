package com.example.tree.binary_tree;

import java.util.*;

public class BinarySearchTree {
    private Node root;
    private static class  Node{
        private final int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){
            this.value = value;
        }
        public int getValue(){
            return value;
        }
    }
    public BinarySearchTree(){

    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    private boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
        root = insert(root,value);
    }
    private Node insert(Node node,int value){
        if(node == null){
            return new Node(value);
        }
        if(value < node.value){
            node.left = insert(node.left,value);

        }
        if(value > node.value){
            node.right = insert(node.right,value);
        }

        node.height = 1 + Math.max(height(node.left), height(node.right));
        return node;
    }

    public void populate(int[]array){
        for(int i=0;i<array.length;i++){
            this.insert(array[i]);
        }
    }

    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length);
    }
    private void populateSorted(int[] nums,int start,int end){
        if(start >= end){
            return;
        }

        int mid = (start + end)/2;
        this.insert(nums[mid]);
        populateSorted(nums,start,mid);
        populateSorted(nums,mid+1,end);

    }

    public boolean isBalanced(){
       return isBalanced(root);

    }
    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }
    public List<List<Integer>> breadthFirst(){
        return breadthFirst(this.root);
    }


    //breath first search(bfs)
    private List<List<Integer>> breadthFirst(Node node){
        if(node == null ){
            return null;
        }

        List<List<Integer>> outer = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            int len= queue.size();
            for (int i=0;i<len;i++){
                Node current = queue.poll();
                inner.add(current.value);
              if(current.left != null){
                  queue.offer(current.left);
              }
              if(current.right != null){
                  queue.offer(current.right);
              }
            }

            outer.add(inner);
        }
        return outer;

    }

    //level order successor of node
    public int nodeAfter(int key){
        return nodeAfter(this.root,key);

    }
    private int nodeAfter(Node node,int key){
        if(node == null){
            return -1;
        }
        Queue<Node> queue = new LinkedList<>();
        int val;
        Node current = node;
        queue.offer(current);

        while (!queue.isEmpty()){
            current = queue.poll();
            if(current.left!= null){
                queue.offer(current.left);
            }
            if(current.right !=null){
                queue.offer(current.right);
            }
            if(current.value == key){
                break;

            }
        }
      if(!queue.isEmpty()){
          return queue.peek().value;

      }else {
          return -1;
      }
    }


    //zigzagLevelOrder
    private ArrayList<ArrayList<Integer>> zigzagLevelOrder(Node node){
        if(node == null){
            return new ArrayList<>();
        }
        boolean reverse = false;
        Deque<Node> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        queue.offer(node);
        while (!queue.isEmpty()){
            ArrayList<Integer> inner = new ArrayList<>();
            int size = queue.size();
            for(int i=0;i<size;i++){
                if(!reverse){
                    Node current = queue.pollFirst();
                    inner.add(current.value);
                    if(current.left != null){
                        queue.offerLast(current.left);
                    }
                    if(current.right != null){
                        queue.offerLast(current.right);
                    }
                }else {
                    Node current = queue.pollLast();
                    inner.add(current.value);
                    if(current.right != null){
                        queue.offerFirst(current.right);
                    }
                    if(current.left != null){
                        queue.offerFirst(current.left);
                    }
                }
            }
            reverse = !reverse;
            result.add(inner);

        }
        return result;

    }


    private List<List<Integer>> reverseArrayList(Node node){
        if(node == null ){
            return null;
        }

        List<List<Integer>> outer = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        while (!queue.isEmpty()){
            List<Integer> inner = new ArrayList<>();
            int len= queue.size();
            for (int i=0;i<len;i++){
                Node current = queue.poll();
                inner.add(current.value);
                if(current.left != null){
                    queue.offer(current.left);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
            }

            outer.add(0,inner);
        }
        return outer;

    }

}



