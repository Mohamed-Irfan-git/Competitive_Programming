package com.example.thread.basic;

public class Drivers extends Thread{
    @Override
    public void run(){
        for (char a='a' ; a<='z' ;a++){
            System.out.println(a);
        }
    }
}
