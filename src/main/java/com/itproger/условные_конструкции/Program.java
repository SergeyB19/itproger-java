package com.itproger.условные_конструкции;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите роль: ");
        String role = scanner.nextLine();
        System.out.print("Введите пароль: ");
        String pass = scanner.nextLine();
        if (role.equals("Admin") && pass.equals("12345")) {
            System.out.println("Все пользователи");
        } else {
            System.out.print("Привет, как Вас зовут?");
            String name = scanner.nextLine();
        }

    }
}