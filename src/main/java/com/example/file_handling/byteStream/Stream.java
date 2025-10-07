package com.example.file_handling.byteStream;

import java.io.*;

/**
 * Java has tow stream classes byte steam and character stream
 *
 * byte stream used to binary data(image,audio,video)
 * char stream used to text data (text files)
 *
 * byte stream has main classes
 * 1.Inout Stream
 * 2.Output Stream
 *
 * Subclasses
 * 1.FileInoutStram / FileOutputStream -> file I/O
 * 2.DataInputStream/ DataOutputStream -> read and write primitive data types
 * 3.BufferedInputStream / BufferedOutputStream -> fast read and write purpose with buffer

 */
public class Stream {
    public static void main(String[] args) throws IOException {
        File file = new File("example.txt");


        if(file.exists()){
            System.out.println("file exists");
        }
        else{
            if(file.createNewFile()){
                System.out.println("file created");
            }else {
                System.out.println("Fail to create file");
            }
        }

        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Hello World\n");
        fileWriter.write("my name is irfan");
        fileWriter.close();


        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        fileReader.close();

        FileInputStream fileInputStream = new FileInputStream(file);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        int i;

        // this one only work for byte Stream
        while ((i=bufferedInputStream.read())!=1){
            System.out.println((char)i);
        }

        fileInputStream.close();
    }
}
