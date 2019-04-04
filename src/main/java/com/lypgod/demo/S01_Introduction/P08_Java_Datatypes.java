package com.lypgod.demo.S01_Introduction;

import java.util.Scanner;

public class P08_Java_Datatypes {
    public static void main(String[] argh) {
        Scanner scaner = new Scanner(System.in);
        int t = scaner.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = scaner.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (Exception e) {
                System.out.println(scaner.next() + " can't be fitted anywhere.");
            }

        }

        scaner.close();
    }
}
