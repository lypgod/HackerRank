package com.lypgod.demo.S04_Data_Structures;

import java.util.Scanner;

public class P02_Java_2D_Array {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

        int high = 0;
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                int temp = arr[i][j] + arr[i + 1][j] + arr[i + 2][j] + arr[i + 1][j + 1] + arr[i][j + 2] + arr[i + 1][j + 2] + arr[i + 2][j + 2];
                if (i == 0 && j == 0) {
                    high = temp;
                } else {
                    high = temp > high ? temp : high;
                }
            }
        }

        System.out.println(high);
    }
}
