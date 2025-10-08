package com.example.thread.deadlock;

public class DeadLock {
    public static void main(String[] args) {
        Resourcers pen = new Resourcers("pen");
        Resourcers notebook = new Resourcers("notebook");

        Thread t1 = new Thread(()->{
            synchronized (pen) {
                System.out.println("Thread 1 locked " + pen.getName());
                try {
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    System.out.println(e.getMessage());

                }
                synchronized (notebook) {
                    System.out.println("Thread 1 locked " + notebook.getName());
                }

            }
        });

        Thread t2 = new Thread(()->{
            synchronized (notebook) {
                System.out.println("Thread 2 locked " + notebook.getName());
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                synchronized (pen) {
                    System.out.println("Thread 2 locked " + pen.getName());
                }
            }
        });

        t1.start();
        t2.start();
    }
}
