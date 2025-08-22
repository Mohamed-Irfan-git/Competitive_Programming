package com.example.tree.avl_tree;

public class Avl {
    private static class Node {
        private final int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public Avl() {

    }
    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (root == null) {
            return 0;
        }
        return node.height;
    }

    public void insert(int value) {
        insert(this.root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if (value > node.value) {
            node.right = insert(node.right, value);
        }
        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return rotate(node);
    }

    private Node rotate(Node node) {
        if (height(node.left) - height(node.right) > 1) {
            if (height(node.left.left) - height(node.left.right) > 0) {
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }

        }
        if (height(node.left) - height(node.right) < -1) {
            if (height(node.right.left) - height(node.right.right) < 0) {
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }
        return node;
    }
    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = 1 + Math.max(height(c.left), height(c.right));
        c.height = 1 + Math.max(height(t), height(c.left));

        return c;

    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = 1 + Math.max(height(p.left), height(p.right));
        c.height = 1 + Math.max(height(c.left), height(c.right));

        return c;
    }
}
