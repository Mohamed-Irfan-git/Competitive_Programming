package com.example.db;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/lms_db";
        String pass = "Irfan#@123";
        String user = "root";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url,user,pass);
            System.out.println("Database connected successfully");


            String sql = "SELECT * FROM department";
            PreparedStatement ps  = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            String sql2 = "SELECT  name FROM department WHERE department_id= ?";
            PreparedStatement ps1 = connection.prepareStatement(sql2);
            ps1.setString(1,"ICT");
            ResultSet rs1 = ps1.executeQuery();

            while (rs1.next()){
                System.out.println(
                        rs1.getString(1)
                );
            }





        connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver class not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database not connected successfully");
            e.printStackTrace();

        }

    }
}
