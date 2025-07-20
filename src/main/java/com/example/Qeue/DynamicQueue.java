package com.example.Qeue;

public class DynamicQueue extends CustomQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public void insert(int val) throws QueueException {
        if(isFull()){
            int [] temp = new int[end*2];
            for(int i=0;i<end;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        super.insert(val);
    }
}
