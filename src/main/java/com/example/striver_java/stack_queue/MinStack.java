package com.example.striver_java.stack_queue;

public class MinStack {
    private Node head;
    public MinStack() {
        head = null;
    }

    public void push(int value) {
        if(head == null) head = new Node(value,value,head);
        else head = new Node(value,Math.min(value,head.min),head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    public class Node{
        int val;
        int min;
        Node next;

        public Node(int val,int min,Node next){
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

}
