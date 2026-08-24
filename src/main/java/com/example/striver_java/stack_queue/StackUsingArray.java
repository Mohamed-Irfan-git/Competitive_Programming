package com.example.striver_java.stack_queue;

public class StackUsingArray {
    private int top;
    private int [] arr;
    private int MAX;

    StackUsingArray(int MAX){
        this.top = -1;
        arr = new int[MAX];
        this.MAX = MAX;
    }
    boolean isFull(){
        return MAX-1 == top;
    }
    boolean isEmpty(){
        return top ==-1;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("Can't add element stack is full");
            return;
        }

        top = top+1;
        arr[top] = val;

    }

    public int getTop(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }

        return arr[top];
    }

    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        top--;
    }

    public void print(){
        for(int i = 0;i<=top;i++){
            System.out.print(arr[i]  + " ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray(5);
        stackUsingArray.push(12);
        stackUsingArray.push(54);
        stackUsingArray.push(12);
        stackUsingArray.push(54);
//        stackUsingArray.push(12);
//        stackUsingArray.push(54);
        stackUsingArray.print();
        System.out.println(stackUsingArray.getTop());

    }
}
