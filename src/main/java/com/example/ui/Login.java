package com.example.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Login {
    public void start(){
        JFrame frame = new JFrame("Login");
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel loginLable = new JLabel("Login",SwingConstants.CENTER);
        loginLable.setBounds(150,30,100,60);
        loginLable.setFont(new Font("Arial",Font.BOLD,20));
        frame.add(loginLable);

        JLabel username = new JLabel("Username");
        username.setBounds(40,100,100,30);
        frame.add(username);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150,100,200,30);
        frame.add(usernameField);

        JLabel pass = new JLabel("Password");
        pass.setBounds(40,150,100,30);
        frame.add(pass);

        JTextField passField = new JTextField();
        passField.setBounds(150,150,200,30);
        frame.add(passField);

        JButton button = new JButton("Login");
        button.setBounds(100,220,200,30);
        frame.add(button);

        JLabel welcomeMsg = new JLabel("Gender");
        welcomeMsg.setBounds(40,260,100,40);
        frame.add(welcomeMsg);

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150,270,80,30);
        frame.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(230,270,80,30);
        frame.add(female);

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);



        JLabel countryLabel = new JLabel("Country");
        countryLabel.setBounds(40, 310, 100, 30);
        frame.add(countryLabel);

        String[] countries = {"Sri Lanka", "India", "USA", "UK", "Japan"};

        JComboBox<String> countryBox = new JComboBox<>(countries);
        countryBox.setBounds(150, 310, 200, 30);
        frame.add(countryBox);


        button.addActionListener((click) -> {
            String name = usernameField.getText();
            String country = (String) countryBox.getSelectedItem();

            System.out.println("Name: " + name);
            System.out.println("Country: " + country);

            if(male.isSelected()){
                System.out.println("Male is selected");
            }
            else if(female.isSelected()){
                System.out.println("Female is selected");
            }

            usernameField.setText(null);
            passField.setText(null);
        });

        passField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyChar() == KeyEvent.VK_ENTER){
                    System.out.println("Enter button pressed");
                }
            }
        });

        frame.setVisible(true);
    }
}