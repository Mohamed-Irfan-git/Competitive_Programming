package com.example.oop.basic.thread;

public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 10; i++) {
            System.out.println("My thread" + " "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}

class YourThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread());
        for (int i = 0; i < 10; i++) {
            System.out.println("Your thread" + " "+i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
