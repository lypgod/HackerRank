package com.lypgod.demo.S04_Data_Structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P08_Java_Stack {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String input = scanner.nextLine();
                String[] split = input.split("");
                List<String> stack = new ArrayList<>();
                boolean flag = true;
                for (String s : split) {
                    if (s.equals("{") || s.equals("(") || s.equals("[")) {
                        stack.add(0, s);
                    } else {
                        if (stack.size() <= 0) {
                            flag = false;
                        } else {
                            if ((s.equals("}") && stack.get(0).equals("{")) || (s.equals(")") && stack.get(0).equals("(")) || (s.equals("]") && stack.get(0).equals("["))) {
                                stack.remove(0);
                            } else {
                                flag = false;
                            }
                        }
                    }
                }
                if (flag && stack.size() != 0) {
                    flag = false;
                }
                System.out.println(flag ? "true" : "false");
            }
        }
    }
}
