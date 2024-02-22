package com.itproger.коллекции;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //Коллекции в Java
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);
        System.out.println(numbers.size());

        for (Integer el : numbers) {
            System.out.println(el);
        }

        System.out.println("numbers.get(1) = " + numbers.get(1));
        System.out.println("numbers.remove(1) = " + numbers.remove(1));
//        numbers.clear();

        LinkedList<Float> floatLinkedList = new LinkedList<>();
        floatLinkedList.add(5.6f);
        floatLinkedList.add(15.6f);
        floatLinkedList.add(5.64356f);
        for (Float el : floatLinkedList) {
            System.out.println("el = " + el);
        }

    }
}
