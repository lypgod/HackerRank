package com.lypgod.demo.S01_Introduction;

import java.util.Scanner;

public class P02_Java_If_Else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if (N > 0 && N <= 100) {
            if ((N & 1) != 0 || (N >= 6 && N <= 20)) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }
}
