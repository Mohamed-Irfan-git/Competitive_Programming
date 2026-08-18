package com.example.thread.basic;


//this is race condition case
// ran condition mean multiple thread access same variable ot somthing
public class Race {
    static int count = 0;

    static final Object lock = new Object();

//    static synchronized void increment(){
//        count++;
//    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(()->{
            for (int i=0;i<10000;i++){
                synchronized (lock){
                    count++;
                }
            }
        });

        Thread thread1 = new Thread(()->{
            for (int i=0;i<10000;i++){
                synchronized (lock){
                    count++;
                }
            }
        });

        thread.start();
        thread1.start();

        thread.join();
        thread1.join();

        System.out.println(count);
    }

}
