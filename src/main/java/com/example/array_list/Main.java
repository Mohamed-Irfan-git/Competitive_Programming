package com.example.array_list;

public class Main {
    public static void main(String[] args) throws Exception {
        ArList arList = new ArList();
        arList.add(10);
        arList.add(20);
        arList.add(30);
        arList.add(15);
        System.out.println(arList.delete(1));
        arList.display();

    }
}
