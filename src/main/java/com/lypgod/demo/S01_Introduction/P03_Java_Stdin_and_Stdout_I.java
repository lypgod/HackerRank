package com.lypgod.demo.S01_Introduction;

import java.util.Scanner;

public class P03_Java_Stdin_and_Stdout_I {

    public static void main(String[] args) {
        int[] a = new int[3];
        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < a.length; i++) {
                a[i] = scan.nextInt();
            }
        }

        for (int i : a) {
            System.out.println(i);
        }
    }
}
