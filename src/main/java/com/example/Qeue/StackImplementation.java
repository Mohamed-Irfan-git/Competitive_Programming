package com.example.Qeue;

import java.util.LinkedList;
import java.util.Queue;

public class StackImplementation {
    Queue<Integer> queue1 ;
    Queue<Integer> queue2 ;

    StackImplementation(){
        this.queue1 = new LinkedList<>();
        this.queue2 = new LinkedList<>();
    }

    public void push(int x){
        queue1.offer(x);
    }
    public int pop(){
        int size = queue1.size()-1;
        for (int i =0;i<size;i++){
            queue2.offer(queue1.poll());
        }
        int x = 0;
        if(!queue1.isEmpty()){
            x = queue1.poll();
        }

        for(int i =0;i<size;i++){
            queue1.offer(queue2.poll());
        }
        return x;

    }
    public int top(){
        int size = queue1.size()-1;
        for (int i =0;i<size;i++){
            queue2.offer(queue1.poll());
        }
        int x = 0;
        if(!queue1.isEmpty()){
            x = queue1.poll();
        }

        for(int i =0;i<size;i++){
            queue1.offer(queue2.poll());
        }
        queue1.offer(x);
        return x;

    }
    public boolean empty(){
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackImplementation stackImplementation = new StackImplementation();
        stackImplementation.push(1);
        stackImplementation.push(2);
        System.out.println(stackImplementation.pop());
        System.out.println(stackImplementation.top());
        System.out.println(stackImplementation.empty());
    }

}



