package com.example.file_handling.byteStream;

import java.io.*;

public class Example1 {
    public static void main(String[] args) {

        File file = new File("text.txt");
        File copy = new File("copy.txt");

        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            String data = "Irfan software engineer\n";
            byte[] bytes = data.getBytes();
            fos.write(bytes);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        try (
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fosCopy = new FileOutputStream(copy, false)
        ) {

            int byteData;

            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // optional print
                fosCopy.write(byteData);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}