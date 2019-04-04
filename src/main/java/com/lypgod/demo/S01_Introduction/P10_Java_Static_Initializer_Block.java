package com.lypgod.demo.S01_Introduction;

import java.util.Scanner;

public class P10_Java_Static_Initializer_Block {
    private static boolean flag;
    private static int B, H;

    static {
        try (Scanner scan = new Scanner(System.in)) {
            B = scan.nextInt();
            H = scan.nextInt();
            if (B >= -100 && B <= 100 && H >= -100 && H <= 100) {
                flag = true;
            }

            if (B <= 0 || H <= 0) {
                flag = false;
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}
