package com.example.oop.basic;

public class Vehicle {
    double speed = 10.0;

    public void start(){
        System.out.println("vehicle started");
    }

    public static void toSpeed(){
        System.out.println("can't go more then 100kmph");
    }
}


class Car extends Vehicle{

    @Override
    public void start(){
        System.out.println("Car is started");
    }

    public static void toSpeed(){
        System.out.println("can't go more then 150kmph");
    }
}
