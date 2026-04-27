package com.example.thread.basic;

public class SimpleThread {
    static void threadMessage(String message){

        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n",threadName, message);

    }

    private static class MessageLoop implements Runnable{
        @Override
        public void run() {
            String [] importantInfo = {
                    "Mares eat oats",
                    "Does eat oats",
                    "Little lambs eat ivy",
                    "A kid will eat ivy too"
            };

            try {
                for (String s : importantInfo) {
                    Thread.sleep(2000);
                    threadMessage("");
                }
            }
            catch (InterruptedException e) {
                threadMessage("i wasn't done");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        long patience = 60 * 1000 *60;

        if(args.length > 0){
            try{
                patience = Long.parseLong(args[0])*1000;
            }catch (NumberFormatException e){
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        threadMessage("starting messaging loop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());

        t.start();

        threadMessage("Waiting for MessageLoop thread to finish");

        while (t.isAlive()) {
            threadMessage("Still waiting...");

            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience)
                    && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                t.join();
            }
        }
        threadMessage("Finally!");

    }
}
