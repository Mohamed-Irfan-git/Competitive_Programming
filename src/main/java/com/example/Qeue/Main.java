package com.example.Qeue;

public class Main {
    public static void main(String[] args) throws Exception {
        CustomQueue customQeue = new DynamicQueue(5);
        customQeue.insert(15);
        customQeue.insert(10);
        customQeue.insert(20);
        customQeue.insert(30);
        System.out.println(customQeue.remove());
        customQeue.insert(42);
        customQeue.insert(28);
        System.out.println(customQeue.remove());
        customQeue.display();
    }
}
