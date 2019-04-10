package com.lypgod.demo.S04_Data_Structures;

import java.util.Arrays;
import java.util.Scanner;

public class P03_Java_Subarray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String in = scanner.nextLine();

            String[] ss = in.split(" ");
            int[] ints = new int[ss.length];
            for (int i = 0; i < ss.length; i++) {
                ints[i] = Integer.parseInt(ss[i]);
            }

            int count = 0;
            for (int i = 0; i < ints.length; i++) {
                for (int j = 0; j < ints.length - i; j++) {
                    count += Arrays.stream(Arrays.copyOfRange(ints, j, j + i + 1)).sum() < 0 ? 1 : 0;
                }
            }

            System.out.println(count);
        }
    }
}
