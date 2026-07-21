package com.example.file_handling.charStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class CharStream {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileInputStream fis =new FileInputStream(new File("example.txt"));
            FileOutputStream fos = new FileOutputStream(new File("copy.txt"),true)){
            byte[] bytes = new byte[1024];




            int length;
            while ((length = fis.read(bytes)) > 0){
//                String s = "ahello world";
//                bytes = s.getBytes();
                fos.write(bytes,0,length);
                System.out.print(new String(bytes, 0, length));

            }

//

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


//        Scanner scan = new Scanner(new File("example.txt"));
//        System.out.print("input a : ");
//        int a = scan.nextInt();
//        System.out.print("input b : ");
//        int b = scan.nextInt();
//        System.out.print("input a string : ");
//        scan.next();
//        String str = scan.nextLine();

//        while(scan.hasNextLine()){
//            String line = scan.nextLine();
//            System.out.println(line);
//        }



    }
}
