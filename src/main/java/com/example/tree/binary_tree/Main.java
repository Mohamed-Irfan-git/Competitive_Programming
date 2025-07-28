package com.example.tree.binary_tree;

import com.example.tree.avl_tree.AVL;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        BinaryTree binaryTree = new BinaryTree();
//        binaryTree.tree(10);
//        binaryTree.prettyDisplay();
//        binaryTree.preOrder();



        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(5);
        binarySearchTree.insert(3);
        binarySearchTree.insert(2);
        binarySearchTree.insert(7);
        binarySearchTree.insert(4);
        binarySearchTree.breadthFirst();
//        List<List<Integer>> list = new ArrayList<>();
//        list.addAll(binarySearchTree.breadthFirst());
//        List<Integer> list = new ArrayList<>();
//        System.out.println(list);
//        binarySearchTree.display();

//        int [] arr ={1,2,3,4,5};
//        binarySearchTree.populateSorted(arr);
//        binarySearchTree.display();
//        System.out.println(binarySearchTree.isBalanced());

        AVL avl = new AVL();
        avl.insert(5);
        avl.insert(3);
        avl.insert(2);
        avl.insert(7);
        avl.insert(4);
        avl.insert(6);
        avl.insert(8);
        avl.insert(9);
        avl.insert(10);
        avl.display();

        List<Double> list1 = new ArrayList<>(avl.breadthFirstAverage());
        System.out.println(list1);



    }
}
