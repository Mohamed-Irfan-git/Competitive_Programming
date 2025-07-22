package com.example.tree.avl_tree;

public class Main {
    public static void main(String[] args) {
        AVL avl = new AVL();
        for(int i=1;i<15;i++){
            avl.insert(i);
        }
        System.out.println(avl.height());
    }
}
