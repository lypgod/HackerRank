package com.lypgod.demo.S02_Strings;

import java.util.Scanner;

public class P05_Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        java.util.Map<Character, Integer> countMap = new java.util.HashMap<>();
        for (char c : a.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }

        for (char c : b.toCharArray()) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) - 1);
            } else {
                return false;
            }
        }

        for (Integer i : countMap.values()) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
