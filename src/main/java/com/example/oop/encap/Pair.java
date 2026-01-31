package com.example.oop.encap;

public class Pair {
    private final int  first;
    private final int second;

    Pair(int first, int second){
        this.first = first;
        this.second = second;
    }

    public int first(){
        return this.first;
    }

    public int second(){
        return this.second;
    }
}
