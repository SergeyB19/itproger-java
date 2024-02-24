package com.itproger.данные_от_пользователя;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     /*   System.out.println("Введите ваше имя: ");
        String userName = scanner.nextLine();
        System.out.println("Привет " + userName);
        int num1 = scanner.nextInt();
        byte num2 = scanner.nextByte();
        boolean b = scanner.nextBoolean();
        float num3 = scanner.nextFloat();*/

        System.out.println("Введите 1 число: ");
        float num3 = scanner.nextFloat();
        short num1 = 50;
        short num2 = 10;
        int res = num1 + num2;

        System.out.println("Введите 2 число: ");
        float num4 = scanner.nextFloat();
        res = res + 10;
        res += 10;
        float res1 = num1 + num2;
        float res2 = num1 - num2;
        float res3 = num1 * num2;
        float res4 = num1 / num2;

        System.out.println("Результат: " + res);
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);

    }
}
