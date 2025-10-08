package com.example.thread;

public class CurrentThread {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: " + t);

        t.setName("MyThread");
        System.out.println("After name change: " + t);

        try {
            for (int i = 0; i < 7; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
