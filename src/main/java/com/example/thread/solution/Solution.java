package com.example.thread.solution;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 *simplest solution make that threads in same order
 * in here we does not going to see that we here will see locktry method
 */
public class Solution {
    public static void main(String[] args) {
        Resources pen = new Resources("pen");
        Resources notebook = new Resources("notebook");

        ReentrantLock lock1 = new ReentrantLock();
        ReentrantLock lock2 = new ReentrantLock();


        Thread t1 = new Thread(()->{
            while(true){
                try {
                    if(lock1.tryLock(500, TimeUnit.MILLISECONDS)){
                        System.out.println("Thread 1 locked "+pen.getName());
                        if(lock2.tryLock(500, TimeUnit.MILLISECONDS)){
                            System.out.println("Thread 1 locked "+notebook.getName());

                            System.out.println("Thread 1 is working");
                            lock2.unlock();
                            lock1.unlock();

                        }
                        else{
                            System.out.println("Thread 1 couldn't lock notebook, retrying...");
                            lock1.unlock(); // release lock1 and retry
                        }
                    }
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });


        // Thread 2
        Thread t2 = new Thread(() -> {
            while (true) {
                try {
                    if (lock2.tryLock(500, TimeUnit.MILLISECONDS)) { // try lock2
                        System.out.println("Thread 2 locked notebook");
                        if (lock1.tryLock(500, TimeUnit.MILLISECONDS)) { // try lock1
                            System.out.println("Thread 2 locked pen");
                            // Critical section: safely access resources
                            System.out.println("Thread 2 is working...");
                            lock1.unlock();
                            lock2.unlock();
                            break; // done
                        } else {
                            System.out.println("Thread 2 couldn't lock pen, retrying...");
                            lock2.unlock(); // release lock2 and retry
                        }
                    }
                    Thread.sleep(100); // wait before retry
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
