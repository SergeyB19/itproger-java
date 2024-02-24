package com.itproger.изучение_Java_за_один_час.OOP;

public class Person {
    int height;
    float weight;
    public static int summ = 478;

    public Person() {
    }

    public Person(int height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    void say(String str) {
        System.out.println(str);
    }
}
