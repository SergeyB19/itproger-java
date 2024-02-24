package com.itproger.изучение_Java_за_один_час;

public class ForWhileMain {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Element i is: " + i);
        }
        System.out.println("####################");
        for (int i = 100; i >= 10; i -= 10) {
            System.out.println("Element i is: " + i);
        }

        int i = 0;

        while (i <= 15) {
            System.out.println("Element i is: " + i);
            i++;
        }
        int a = 100;
        do {
            System.out.println("Element i is: " + i);
        } while (i < 10);
    }
}
