package com.lypgod.demo.S04_Data_Structures;

import java.util.*;

public class P07_Java_Map {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine();

            Map<String, String> book = new HashMap<>();
            for (int i = 0; i < n; i++) {
                book.put(scanner.nextLine(), scanner.nextLine());
            }

            while (scanner.hasNext()) {
                String query = scanner.nextLine();
                if (book.containsKey(query)) {
                    System.out.println(query + "=" + book.get(query));
                } else {
                    System.out.println("Not found");
                }
            }
        }
    }
}
