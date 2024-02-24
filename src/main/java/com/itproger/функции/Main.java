package com.itproger.функции;

public class Main {
    public static void main(String[] args) {
        //Функции
        byte[] nums1 = new byte[]{5, 6, 8};
        int summa1 = summaArray(nums1);
        System.out.println(summa1);
        info("Hello");
        String java = "Java";
        info(java);
        info("");
        summa((short) 5, (short) 7);
        short num2 = 8;
        int result2 = summa((short) 4, num2);
        info(String.valueOf(result2));
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }

    public static void info(String word) {
        System.out.println(word);
        System.out.println("!");
        System.out.println("Hello");
    }

    public static int summa(short a, short b) {
        int res = a + b;
        System.out.println("Результат: " + res);
        String result = "Результат: " + res;
        info(result);
        return res;
    }
}
