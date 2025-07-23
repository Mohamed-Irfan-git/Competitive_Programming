package com.example.linked_list;

public class LinkList {

    private final class Node {
         int data;
         Node next;

        private Node(int data) {
            this.data = data;
        }
        private Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head;
    private Node tail;

    public void insertFirst(int data){
        if(head==null){
            head=new Node(data);
            tail=head;
        }
        Node node=new Node(data);
        node.next = head;
        head = node;
    }
    public void insertLast(int data){
        if(tail==null){
            tail=new Node(data);
            head=tail;
        }
        Node node=new Node(data);
        tail.next=node;
        node.next=null;
        tail=node;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
}
