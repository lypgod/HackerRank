package com.lypgod.demo.S04_Data_Structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_Java_List {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            scanner.nextLine();

            List<Integer> collect = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                collect.add(scanner.nextInt());
            }
            scanner.nextLine();

            n = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < n; i++) {
                String opration = scanner.nextLine();
                String params = scanner.nextLine();
                if (opration.equals("Insert")) {
                    String[] s = params.split(" ");
                    collect.add(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
                }
                if (opration.equals("Delete")) {
                    collect.remove(Integer.parseInt(params));
                }
            }

            collect.forEach(e -> System.out.print(e + " "));
        }
    }

}
