package com.lypgod.demo.S06_Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P01_Java_Exception_Handling_Try_Catch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int setSize = scanner.nextInt();
            int noOps = scanner.nextInt();
            System.out.println(setSize / noOps);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
