package com.lypgod.demo.S04_Data_Structures;

import java.util.Scanner;

public class P05_Java_1D_Array_Part_2 {

    static boolean canWin(String[] gameArray, int jumpLength, int currentPos, int lastJumpPos) {

        boolean didWin = false;

        int range = currentPos;

        while (range < gameArray.length - 1 && gameArray[range + 1].equals("0")) {
            range++;
        }
        if (range == gameArray.length - 1) return true;

        int lowRange = range;
        while (lowRange > lastJumpPos && gameArray[lowRange - 1].equals("0") && (lowRange + jumpLength) > range + 1) {
            lowRange--;
        }
        currentPos = lowRange;
        for (int i = currentPos; i <= range; i++) {
            if ((i + jumpLength) < gameArray.length && gameArray[i + jumpLength].equals("0") && jumpLength != 0) {
                didWin = canWin(gameArray, jumpLength, i + jumpLength, i);
            }

            if (didWin || (i + jumpLength) >= gameArray.length || (i + 1) >= gameArray.length) {
                didWin = true;
                break;
            }
        }

        return didWin;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();
        for (int i = 0; i < numCases; i++) {
            int arraySize = sc.nextInt();
            int jumpLength = sc.nextInt();
            sc.nextLine();
            String[] gameArray = sc.nextLine().split(" ");
            if (canWin(gameArray, jumpLength, 0, 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
