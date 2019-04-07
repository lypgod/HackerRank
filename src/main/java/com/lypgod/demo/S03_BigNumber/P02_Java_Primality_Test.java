package com.lypgod.demo.S03_BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class P02_Java_Primality_Test {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String n = scanner.nextLine();
            System.out.println(new BigInteger(n).isProbablePrime(1) ? "prime" : "not prime");
        }
    }
}
