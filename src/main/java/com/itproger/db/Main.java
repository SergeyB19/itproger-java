package com.itproger.db;

public class Main {
    public static void main(String[] args) {
        DB db = new DB();

        info("Hello World");

        Person.count = 5;
        System.out.println(Person.count);

        Person person1 = new Person();
        Person.getCount();
        Person person2 = new Person();
        Person.getCount();
        Person person3 = new Person();
        Person.getCount();
        Person person4 = new Person();
        person4.getCount();

        final int count = 10;

    }

    public static void info() {
        System.out.println("Hello");
    }

    public static void info(String word) {
        System.out.println(word + "!");
    }
}
