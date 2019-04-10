package com.lypgod.demo.S04_Data_Structures;

import java.util.HashSet;
import java.util.Scanner;

public class P09_Java_Hashset {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int t = s.nextInt();
            String[] pair_left = new String[t];
            String[] pair_right = new String[t];

            for (int i = 0; i < t; i++) {
                pair_left[i] = s.next();
                pair_right[i] = s.next();
            }
            HashSet hashSet = new HashSet();
            int count = 0;
            for (int i = 0; i < t; i++) {
                if (hashSet.add(pair_left[i] + " " + pair_right[i])) {
                    count++;
                }
                System.out.println(count);
            }
        }
    }
}
