package com.itproger.изучение_Java_за_один_час.OOP;

public class OOPMain {
    public static void main(String[] args) {
        final double pi = Math.PI;
        System.out.println(Person.summ);
        Person maks = new Person();
        maks.height = 180;
        maks.weight = 78.4f;
        maks.say("Hi, I'm Maks!");
        System.out.println(maks.height);

        Person oleg = new Person();
        oleg.height = 195;
        oleg.weight = 96.7f;
        System.out.println(oleg.height);

        Student vova = new Student(178,98f,3);
        System.out.println(vova.course);

    }
}
