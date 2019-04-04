package com.lypgod.demo.S02_Strings;

import java.util.Scanner;

public class P06_Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] split = s.trim().split("[ !,?._'@]+");
            System.out.println(split.length);
            for (String s1 : split) {
                System.out.println(s1);
            }
        }

        scan.close();
    }
}
