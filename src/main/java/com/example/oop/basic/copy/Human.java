package com.example.oop.basic.copy;

public class Human implements Cloneable{
    String name;
    int age;
    int [] arr;

    public Human(String name,int age){
        this.name = name;
        this.age = age;
        this.arr = new int[]{1,2,3,4,5,6,7};
    }

//    public Human (Human other){
//        this.name = other.name;;
//        this.age = other.age;
//        this.ar
//    }

    public Object clone() throws CloneNotSupportedException{
        //shallow copy
        Human copy =  (Human)super.clone();
        int n = this.arr.length;
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = this.arr[i];
        }

        copy.arr = arr;
        return copy;
    }

}
