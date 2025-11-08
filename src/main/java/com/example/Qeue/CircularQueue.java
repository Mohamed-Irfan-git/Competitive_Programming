package com.example.Qeue;


public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    protected int front= 0;
    protected int end = 0;

    //When we not give any size, it set it ti the default one
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size) {
        this.data=new int[size];
    }

    public void insert(int val) throws QueueException{
        if(isFull()){
            throw new QueueException("Queue is full");
        }

        data[end++]=val;
        end= end% data.length;
        size++;

    }
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int temp=data[front++];
        front= front% data.length;
        size--;
        return temp;
    }

    private boolean isEmpty() {
        return front == 0;
    }


    private boolean isFull() {
        return size == data.length;
    }
    public void display(){
        int n = front;
        do{
            System.out.print(data[n]+" ");
            n++;
            n = n%data.length;

        }while(n!=end);
        System.out.println("END");
    }


}
