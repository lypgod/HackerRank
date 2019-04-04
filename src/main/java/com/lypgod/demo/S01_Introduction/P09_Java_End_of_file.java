package com.lypgod.demo.S01_Introduction;

import java.util.Scanner;

public class P09_Java_End_of_file {
    public static void main(String[] argh) {
        Scanner scaner = new Scanner(System.in);
        String s = scaner.nextLine();
        int lineNumber = 1;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lineNumber++).append(" ").append(s);
        while(!s.endsWith(".") && scaner.hasNext()) {
            s = scaner.nextLine();
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append(lineNumber++).append(" ").append(s);
        }
        System.out.println(stringBuilder.toString());
        scaner.close();
    }
}
