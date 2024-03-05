package com.itproger.db;

public class Person {
    public static int count;
    public int health;

    public Person() {
        count++;
    }

    public static void getCount() {
        System.out.println("Количество " + count);
    }
}
