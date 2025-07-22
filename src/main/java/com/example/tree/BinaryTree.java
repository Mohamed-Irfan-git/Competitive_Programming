package com.example.tree;

import java.util.Scanner;

public class BinaryTree {
    private Node root;

    private static class Node {
        private final int val;
        private Node left;
        private Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    public void tree(int val){
        root = new Node(val);
        tree(val,root);
    }

    private void tree(int val,Node node){
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you want to add in left :");
        boolean left = scan.nextBoolean();

        if(left){
            int leftVal = scan.nextInt();
            node.left = new Node(leftVal);
            tree( leftVal,node.left);
        }

        System.out.print("Do you want to add in Right : ");
        boolean right = scan.nextBoolean();
        if(right){
            int rightVal = scan.nextInt();
            node.right = new Node(rightVal);
            tree( rightVal,node.right);
        }

    }
    public void prettyDisplay(){
        prettyDisplay(this.root,0);


    }
    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        //print root node's right side
        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        } else {
            System.out.println(node.val);
        }

        //print root node's left side
        prettyDisplay(node.left, level + 1);
    }

    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);

    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);

    }

    public void pastOrder(){
        pastOrder(root);
    }
    private void pastOrder(Node node){
        if(node == null){
            return;
        }
        pastOrder(node.left);
        pastOrder(node.right);
        System.out.print(node.val+" ");

    }




}
