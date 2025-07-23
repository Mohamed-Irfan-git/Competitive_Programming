package com.example.linked_list;

public class Main {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertFirst(10);
        linkList.insertFirst(20);
        linkList.insertFirst(30);
        linkList.insertFirst(40);
        linkList.insertFirst(50);
        linkList.insertLast(32);
        linkList.display();
    }
}
