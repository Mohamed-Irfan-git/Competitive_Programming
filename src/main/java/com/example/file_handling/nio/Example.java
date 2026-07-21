package com.example.file_handling.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Example {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("text.txt");
        Path path1 = Paths.get("example.txt");
        Files.writeString(path,"Hello buddy\n", StandardOpenOption.APPEND);
        Files.readString(path);
        Files.copy(path,path1, StandardCopyOption.REPLACE_EXISTING);

        BasicFileAttributes bsc = Files.readAttributes(path,BasicFileAttributes.class);
        System.out.println(bsc.size());
        System.out.println(bsc.creationTime());
        System.out.println(bsc.lastModifiedTime());
        System.out.println(Files.readString(path));

    }
}
