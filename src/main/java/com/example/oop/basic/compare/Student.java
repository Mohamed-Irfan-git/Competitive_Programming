package com.example.oop.basic.compare;

public class Student implements Comparable<Student>{
    String name;
    int rollNum;
    int marks;

    public Student(String name,int rollNum,int marks){
        this.name = name;
        this.rollNum = rollNum;
        this.marks= marks;
    }


    @Override
    public int compareTo(Student student) {
        return this.marks - student.marks;
    }
}
