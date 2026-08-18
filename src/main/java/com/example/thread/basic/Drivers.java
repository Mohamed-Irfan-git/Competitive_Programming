package com.example.thread.basic;

import java.util.concurrent.atomic.AtomicInteger;

public class Drivers {
    public static void main(String[] args) throws InterruptedException {
        VisibilityProblem visibilityProblem = new VisibilityProblem();
        Thread thread = new Thread(visibilityProblem);
        thread.start();
        Thread.sleep(1000);
        visibilityProblem.stop();

        // this is thread safe
        AtomicInteger automic = new AtomicInteger(0);

    }
}
