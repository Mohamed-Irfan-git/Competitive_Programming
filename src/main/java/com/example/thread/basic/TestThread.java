package com.example.thread.basic;

public class TestThread implements Runnable{

    @Override
    public void run() {
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        new Thread(new TestThread()).start();
    }
}


