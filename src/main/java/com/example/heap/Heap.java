package com.example.heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList <T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first,int second){
        T tmp = list.get(first);
        list.set(first, list.get(second));
        list.set(second,tmp);

    }
    private int parent(int  index){
        return  (index-1)/2;
    }
    private int left(int  index){
        return 2*index+1;
    }
    private int right(int  index){
        return 2*index+2;
    }
    public void insert(T value){
        list.add(value);
        upheap(list.size()-1);

    }
    private void upheap(int index){
        if(index==0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index,p);
            upheap(p);
        }
    }

    public T remove() throws Exception{
       if(list.isEmpty()){
           throw new Exception("List is empty");
       }
       T temp = list.get(0);
       T num = list.remove(list.size()-1);
       if(!list.isEmpty()){
           list.set(0,num);
           downHeap(0);
       }
       return  temp;
    }

    private void downHeap(int index){

        int min = index;
        int left  = left(index);
        int right = right(index);

        if(left<list.size() && list.get(left).compareTo(list.get(min)) < 0){
            min = left;
        }
        if(right<list.size() && list.get(right).compareTo(list.get(min)) < 0){
            min = right;
        }
        if(min!=index){
            swap(min,index);
            downHeap(min);
        }

    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> list1 = new ArrayList<>();
        while(!list.isEmpty()){
            list1.add(this.remove());

        }
        list=list1;
        return list;
    }


    public ArrayList<T> displayAll(){
        return new ArrayList<>(list);
    }


}
