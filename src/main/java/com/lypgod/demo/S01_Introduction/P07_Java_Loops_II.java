package com.lypgod.demo.S01_Introduction;

import java.util.Scanner;

public class P07_Java_Loops_II {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();
        if (q < 0 || q > 500) {
            return;
        }
        for (int i = 0; i < q; i++) {
            String s1 = scanner.nextLine();
            String[] s = s1.split(" ");
            if (s.length != 3) {
                continue;
            }
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int n = Integer.parseInt(s[2]);
            if (a < 0 || b > 50 || (n < 1 || n > 15)) {
                continue;
            }
            System.out.println(getResult(a, b, n));
        }
        scanner.close();
    }

    private static String getResult(int a, int b, int n) {
        StringBuilder result = new StringBuilder();
        int preResult = a;
        for (int i = 0; i < n; i++) {
            preResult += (int)Math.pow(2D, (double)i) * b;
            result.append(preResult).append(" ");
        }

        return result.toString();
    }
}
