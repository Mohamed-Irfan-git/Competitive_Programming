package com.example.thread.basic;

public class SleepMessages {
    public static void main(String[] args) throws InterruptedException{
        String [] importInfo = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (String s : importInfo) {
            Thread.sleep(2000);
            System.out.println(s);
        }
    }
}
