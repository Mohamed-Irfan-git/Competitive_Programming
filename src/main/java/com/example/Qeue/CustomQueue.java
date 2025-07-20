package com.example.Qeue;

public class CustomQueue {
    /*
    here I use protected because I need to use this
    variable in sub class(child)
     */
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
//    protected int ptr=-1;
    int end=0;

    //When we not give any size it set it ti the default one
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data=new int[size];
    }
    public void insert(int val) throws QueueException{
        if(isFull()){
            throw new QueueException("Queue is full");
        }

        data[end]=val;
        end++;

    }
    public int remove()throws QueueException{
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }

        int temp = data[0];
//        int [] tempArray=new int[end];

        //here you can use temp array, but it consumes some space that's why here used only same array
        //ones move the element backward
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
//        data=tempArray;
        end--;
        return temp;
    }

    //check here it is full or not same I make it is protected I want to check this one is full or not like
    protected boolean isFull(){
        return end==data.length || end==DEFAULT_SIZE;
    }
    protected boolean isEmpty(){
        return end==0;
    }

    public void display(){
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("END");
    }
}
