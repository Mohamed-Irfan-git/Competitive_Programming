package com.example.Stack;

public class CustomStack {
    protected int  [] data;
    private static final int DEFAULT_SIZE = 10;
    protected int size =0;

    public CustomStack(){
       this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data = new int [size];

    }

    public void push(int num) throws StackException {
        if(isFull()){
           throw new StackException("Full can't push");
        }
        data[size++]=num;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Empty can't pop");
        }
      int temp = data[size-1];
      size--;
      return temp;
    }

    public boolean isFull()  {
        return size==DEFAULT_SIZE || size==data.length;
    }

    public void display(){
        for(int i=0;i< size;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }
    private boolean isEmpty(){
        return size == 0;
    }


}
