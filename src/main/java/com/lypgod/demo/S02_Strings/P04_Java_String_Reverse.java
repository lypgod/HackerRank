package com.lypgod.demo.S02_Strings;

import java.util.Scanner;

public class P04_Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();

        System.out.println(new StringBuilder(A).reverse().toString().equals(A) ? "Yes" : "No");
    }
}
