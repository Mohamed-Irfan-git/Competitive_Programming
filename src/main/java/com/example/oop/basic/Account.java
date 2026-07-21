package com.example.oop.basic;

public class Account {
    double balance;
    String hello = print();

    static {
        System.out.println("this is static initializer block");
    }

    public Account(){
        System.out.println("empty constructor");
    }

    public Account(double money){
        System.out.println("parameterized constructor");
        this.balance = money;
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }

    public double checkBalance(){
        return balance;
    }

    public static String print(){
        System.out.println("this is print()");
        return "Irfan";
    }
}
