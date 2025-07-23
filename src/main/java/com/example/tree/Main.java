package com.example.tree;

import com.example.tree.binary_tree.BinarySearchTree;

public class Main {
    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.tree(10);
//        binaryTree.prettyDisplay();
//        binaryTree.preOrder();


        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.insert(5);
//        binarySearchTree.insert(3);
//        binarySearchTree.insert(2);
//        binarySearchTree.insert(7);
//        binarySearchTree.insert(4);
//        binarySearchTree.display();

        int [] arr ={1,2,3,4,5};
        binarySearchTree.populateSorted(arr);
        binarySearchTree.display();
        System.out.println(binarySearchTree.isBalanced());



    }
}
