package com.example.ui;

import javax.swing.*;

public class Dashboard {
    public Dashboard(){
        JFrame frame = new JFrame("Dashboard");
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);


        JButton back  = new JButton("Back <-");
        back.setBounds(320,320,200,100);
        frame.add(back);


        back.addActionListener((e)->{
           new Login().start();
           frame.dispose();
        });



        frame.setVisible(true);
    }
}
