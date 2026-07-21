package com.example.oop.basic.costom_arraylist;

import java.util.Arrays;

public class CustomArrayList<T>{
    Object[] arr;
    private int DEFAULT_SIZE =10;
    private int size;

    public CustomArrayList(){
        this.arr = new Object[DEFAULT_SIZE];
        this.size = 0;
    }

    public void add(T data){
        if(size==DEFAULT_SIZE){
            resize();
        }

        arr[size] = data;
        size++;
    }

    public void resize(){
        int newSize = DEFAULT_SIZE*2;
        Object [] temp = new Object[newSize];

        for(int i=0;i <size;i++){
            temp[i] = arr[i];
        }
        arr = temp;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", DEFAULT_SIZE=" + DEFAULT_SIZE +
                ", size=" + size +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        CustomArrayList<String>customArrayList = new CustomArrayList<>();
        customArrayList.add("irfan");
        customArrayList.add("harshana");
        customArrayList.add("dilme");


        System.out.println(customArrayList);
    }
}
