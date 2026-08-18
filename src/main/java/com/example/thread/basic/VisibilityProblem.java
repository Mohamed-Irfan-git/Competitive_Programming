package com.example.thread.basic;

public class VisibilityProblem implements Runnable{
    volatile boolean  running = true;

    @Override
    public void run() {
        while(running){
            System.out.println("working...");
        }
        System.out.println("woker stopped");

    }

    public void stop(){
        running = false;
    }
}
