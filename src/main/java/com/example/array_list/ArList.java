package com.example.array_list;


import java.util.stream.Stream;

public class ArList {
    private int [] data;
    private static final int DEFAULT_SIZE=10;
    private int size =0;

    public ArList(){
        this(DEFAULT_SIZE);
    }

    public ArList(int size){
        this.data=new int[size];
    }

    public void add(int val){
        if(isFull()){
           int [] temp=new int[size*2];
           System.arraycopy(data, 0, temp, 0, size);
           data = temp;

        }
        data[size++]=val;
    }

    private boolean isFull(){
        return size==data.length;
    }

    public void insert(int index,int value){
        for(int i=0;i<size;i++){
            if(i==index){
                data[i]=value;
            }
        }
        
    }
    public int delete(int index){
        int temp=data[index];
        for(int i=0;i<size;i++){
            if(i==index){
                data[i]=data[i+1];
            }
        }
        size--;
        return temp;

    }

    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(data[i]+" ");
        }
    }

}
