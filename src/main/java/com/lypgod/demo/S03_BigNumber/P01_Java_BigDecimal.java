package com.lypgod.demo.S03_BigNumber;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class P01_Java_BigDecimal {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //Write your code here
        Arrays.sort(s, (e1, e2) -> e1 == null || e2 == null ? 0 : new BigDecimal(e2).compareTo(new BigDecimal(e1)));

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
