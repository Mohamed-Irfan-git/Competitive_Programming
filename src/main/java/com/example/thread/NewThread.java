package com.example.thread;

public class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t = new Thread(this,"New Thread");
    }
    @Override
    public void run() {

        for(int i=0;i<10;i++){
            try {
                System.out.println("Child Thread"+i);
                Thread.sleep(500);

            } catch (InterruptedException e) {
                System.out.println("Child Interepted");
            }

        }
        System.out.println("Exiting child thread.");
    }

    public static void main(String[] args) {
        NewThread nt = new NewThread();
        nt.t.start();


        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }

}
