package com.itproger.изучение_Java_за_один_час;

public class ArraysMain {
    public static void main(String[] args) {
        int[][] arr4 = new int[][]{
                {23, 78, 65, 78},
                {23, 78, 65, 78},
                {23, 78, 65, 78}
        };
        arr4[1][1] = 234;
        System.out.println(arr4[1][1]);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr4[i][j] + "    ");
            }
            System.out.println("");
        }


        int[] arr = new int[3];
        int[] arr2 = new int[]{56, 489, 325};

        float[] arr3 = new float[]{56.2f, 489.5f, 325.5f, 678.654f};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        arr[0] = 23;
        arr[2] = 657;
        System.out.println(arr[2]);
        System.out.println(arr2[1]);
    }
}
