package com.example.Qeue;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomQueue customQeue = new DynamicQueue(5);
//        customQeue.insert(15);
//        customQeue.insert(10);
//        customQeue.insert(20);
//        customQeue.insert(30);
//        System.out.println(customQeue.remove());
//        customQeue.insert(42);
//        customQeue.insert(28);
//        System.out.println(customQeue.remove());
//        customQeue.display();

        CircularQueue circularQueue = new CircularQueue(4);
        circularQueue.insert(1);
        circularQueue.insert(2);
        circularQueue.insert(3);
        System.out.println(circularQueue.remove());
        circularQueue.insert(4);
        circularQueue.insert(5);
        circularQueue.display();
    }
}
