package com.example.oop.classes;

public class Human {
    String name;
    int age;

    public Human(){}

    @Override
    public String toString() {
        return "This is Human class";
    }

    public Human(Human h){
        this.name = h.name;
        this.age = h.age;
    }

    private Human(String name, int age){

    }
    static Human copyOf(Human other){
        return new Human(other.name,other.age);
    }
}

class Main{
    public static void main(String[] args) {
        Human h = new Human();
        Human h1 = h;
        System.out.println(h.equals(h1));

    }
}
