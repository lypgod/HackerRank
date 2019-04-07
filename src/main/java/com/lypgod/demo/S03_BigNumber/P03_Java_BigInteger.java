package com.lypgod.demo.S03_BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class P03_Java_BigInteger {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String numOne = scanner.nextLine();
            String numTwo = scanner.nextLine();
            BigInteger bigNumOne = new BigInteger(numOne);
            BigInteger bigNumTwo = new BigInteger(numTwo);
            System.out.println(bigNumOne.add(bigNumTwo));
            System.out.println(bigNumOne.multiply(bigNumTwo));
        }
    }
}
