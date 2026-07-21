package com.example.oop.basic.copy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human irfan = new Human("Irfan",23);
        System.out.println("irfan :" + Arrays.toString(irfan.arr));
        Human copy = (Human)irfan.clone();
        System.out.println("copy :" + Arrays.toString(copy.arr));

        System.out.println("after modification");
        copy.arr[0] = 100;
        System.out.println("irfan :" + Arrays.toString(irfan.arr));
        System.out.println("copy :" + Arrays.toString(copy.arr));


        System.out.println(copy.name);
        System.out.println(copy.age);
    }
}
