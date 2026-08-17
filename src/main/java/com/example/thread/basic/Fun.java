package com.example.thread.basic;

public class Fun {
    public static void main(String[] args) throws InterruptedException {
//        Drivers drivers = new Drivers();
//        drivers.start();

//        Thread thread = new Thread(()->{
//            for (char a='a' ; a<='z' ;a++){
//                System.out.println(a);
//            }
//        });
//        thread.start();
//
//        for(int i=0;i<10;i++){
//            System.out.println(i);
//        }


        Thread worker = new Thread(() -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Worker: " + c);

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        worker.start();
        worker.join();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Main: " + i);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        Runnable task = () ->{
            System.out.println("hi buddy");
        };

        Thread thread = new Thread(task); // instead of writing inside the thread we separating

//        System.out.println(worker.getState());
    }
}
