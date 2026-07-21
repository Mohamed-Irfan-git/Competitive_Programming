package com.example.oop;

import com.example.oop.basic.Account;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(10000);
        account.deposit(10000);
        account.withdraw(5000);

        System.out.println(account.checkBalance());
        Account.print();
        System.out.println();

    }
}
