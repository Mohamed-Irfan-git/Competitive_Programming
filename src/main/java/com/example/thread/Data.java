package com.example.thread;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Data {
    private int val;
    private boolean avilable = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (avilable){
            wait();
        }
        val = value;

        System.out.println("produced->"+value);
        avilable = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException {
        while (!avilable){
            wait();
        }
        System.out.println("consumed->"+val);
        avilable = false;
        notify();
    }

    public static void main(String[] args){
        Data data = new Data();

        Thread thread1 = new Thread(()->{
            try{
                for (int i=1;i<6;i++){
                    data.produce(i);
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        });


        Thread thread2 = new Thread(()->{
            try{
                for (int i=1;i<6;i++){
                    data.consume();
                    Thread.sleep(500);
                }
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        });

        thread1.start();
        thread2.start();

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
    }
}
