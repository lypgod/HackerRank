package com.lypgod.demo.S04_Data_Structures;

import java.util.*;

public class P13_Java_Dequeue {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> set = new HashSet<>();

            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < n; i++) {
                int input = scanner.nextInt();

                deque.add(input);
                set.add(input);

                if (deque.size() == m) {
                    if (set.size() > max) {
                        max = set.size();
                    }
                    int first = deque.remove();
                    if (!deque.contains(first)) {
                        set.remove(first);
                    }
                }
            }

            System.out.println(max);
        }
    }
}
