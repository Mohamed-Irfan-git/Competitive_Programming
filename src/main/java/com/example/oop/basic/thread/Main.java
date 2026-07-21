package com.example.oop.basic.thread;

import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        YourThread yourThread = new YourThread();

        myThread.setPriority(5);
        yourThread.setPriority(10);


        myThread.start();
        yourThread.start();

        Vector<Integer> marks = new Vector<>(List.of(10,20,30,40));
        marks.forEach(System.out::println);


        try {
            myThread.join();
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("this is main");
    }
}
