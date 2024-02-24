package com.itproger.изучение_Java_за_один_час.OOP;

public class Student extends Person {
    int course;


    public Student(int course) {
        this.course = course;
    }

    public Student(int height, float weight, int course) {
        super(height, weight);
        this.course = course;
    }
}
