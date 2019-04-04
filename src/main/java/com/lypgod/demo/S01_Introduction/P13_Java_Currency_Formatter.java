package com.lypgod.demo.S01_Introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class P13_Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();


        NumberFormat cfUs = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
        String us = cfUs.format(payment);

        NumberFormat cfIn = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = cfIn.format(payment);

        NumberFormat cfCh = NumberFormat.getCurrencyInstance(new Locale("zh", "CN"));
        String china = cfCh.format(payment);

        NumberFormat cfFr = NumberFormat.getCurrencyInstance(new Locale("fr", "FR"));
        String france = cfFr.format(payment);


        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
