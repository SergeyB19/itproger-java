package com.itproger.изучение_Java_за_один_час;

public class SwitchMain {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 12:
                System.out.println("Num is 12");
                break;
            case 545:
                System.out.println("Num is 545");
                break;
            case 23:
                System.out.println("Num is 23");
                if (num == 23) {
                    System.out.println("All is ok");
                    break;
                }
            default:
                System.out.println("Num is unknown");
        }
    }
}
