package com.example.db;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        Connection connection = DBConnection.getInstance().getConnection();

        String sql = "INSERT INTO user VALUES (?,?,?,?,?)";
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setInt(1,5);
            preparedStatement.setString(2,"irfan");
            preparedStatement.setString(3,"123");
            preparedStatement.setString(4,"e@mail.com");
            preparedStatement.setString(5,"teacher");

            int row = preparedStatement.executeUpdate();
            if(row>0){
                System.out.println("user table data inserted successfully");
            }


        }catch (Exception e){
            System.out.println(e.getMessage());
        }







    }
}
