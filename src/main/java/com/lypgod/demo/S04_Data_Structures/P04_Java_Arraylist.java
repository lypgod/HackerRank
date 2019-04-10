package com.lypgod.demo.S04_Data_Structures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_Java_Arraylist {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine();

            List<List<Integer>> lists = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = scanner.nextLine();
                String[] s1 = s.split(" ");
                List<Integer> collect = Arrays.stream(Arrays.copyOfRange(s1, 1, s1.length)).map(Integer::parseInt).collect(Collectors.toList());
                lists.add(collect);
            }
            n = scanner.nextInt();
            scanner.nextLine();
            for (int i = 0; i < n; i++) {
                int posX = scanner.nextInt();
                int posy = scanner.nextInt();
                scanner.nextLine();
                try {
                    System.out.println(lists.get(posX - 1).get(posy - 1));
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("ERROR!");
                }
            }
        }
    }
}
