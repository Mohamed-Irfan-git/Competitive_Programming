package com.example.thread;

import java.io.IOException;

public class JoinThread implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"->"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinThread joinThread = new JoinThread();
        Thread thread = new Thread(joinThread,"thread1");
        Thread thread2 = new Thread(joinThread,"thread2");
        Thread thread3 = new Thread(joinThread,"thread3");

        thread.start();
        thread2.start();
        thread3.start();

        thread.join();
        thread2.join();
        thread3.join();

        System.out.println("main thread end");
    }
}
