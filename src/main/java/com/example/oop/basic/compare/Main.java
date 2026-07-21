package com.example.oop.basic.compare;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("kamal",1,80);
        Student s2 = new Student("vimal",2,75);
        Student s3 = new Student ("ahamed",3,92);

        ArrayList<Student> students = new ArrayList<>(List.of(s1,s2,s3));
        students.sort(Student::compareTo);

        students.forEach((item)->{
            System.out.println(item.name +" "+ item.rollNum +" "+ item.marks);
        });
    }
}
