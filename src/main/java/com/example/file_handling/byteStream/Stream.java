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

        try(FileOutputStream fos = new FileOutputStream(file,true)){
            String string = "hello world\n";
            byte [] bt = string.getBytes();
            fos.write(bt);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileInputStream fis = new FileInputStream(file)){
            int i;
            while((i=fis.read())!=-1){
                System.out.print((char)i);
            }
        }



    }
}
