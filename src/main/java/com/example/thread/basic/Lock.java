package com.example.thread.basic;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {
    private static final ReentrantLock lock = new ReentrantLock();
    private static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                if(lock.tryLock()){
                    try {
                        count++;
                    } finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println("could not get lock");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                if(lock.tryLock()){
                    try {
                        count++;
                    } finally {
                        lock.unlock();
                    }
                }
                else{
                    System.out.println("could not get lock");
                }

            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(count);
    }
}









