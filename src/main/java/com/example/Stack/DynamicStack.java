package com.example.Stack;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }
    public DynamicStack(int capacity) {
        super(capacity);
    }

    @Override
    public void push(int num) throws StackException {
        if(isFull()){
            int [] temp = new int[data.length*2];
            System.arraycopy(data, 0, temp, 0, data.length);
            data = temp;
        }
        super.push(num);
    }
}
