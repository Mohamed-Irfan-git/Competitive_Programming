package com.example.oop.encap;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car {
    Date mani_year;
    String model;
    Integer year;

    public Car (Date mani){
        this.mani_year = new Date(mani.getTime());

    }

    public Date getMani_year(){
        return new Date(mani_year.getTime());
    }

    public Date getDate(){
        return mani_year;
    }

}

class Main{
    public static void main(String[] args) {

        List<Pair>  somthing = new ArrayList<>();
        somthing.add(new Pair(1,2));

        for(Pair i : somthing){
            System.out.println(i.first());
            System.out.println(i.second());
        }

    }
}
