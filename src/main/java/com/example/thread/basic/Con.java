package com.example.thread.basic;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Con {
    private static ReentrantLock lock = new ReentrantLock();
    private static Condition condition = lock.newCondition();
    private static boolean ready = false;

    public static void main(String[] args) throws InterruptedException {

        Thread worker = new Thread(() -> {
            lock.lock();
            try {

                while (!ready) {
                    System.out.println("Worker waiting...");
                    condition.await();
                }

                System.out.println("Worker continues!");

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();

            } finally {
                lock.unlock();
            }
        });

        worker.start();
        Thread.sleep(1000);
        lock.lock();

        try {

            System.out.println("Main making worker ready");
            ready = true;
            condition.signal();

        } finally {
            lock.unlock();
        }

        worker.join();
    }
}
