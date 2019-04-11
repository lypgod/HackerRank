package com.lypgod.demo.S04_Data_Structures;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiConsumer;

public class P14_Java_BitSet {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int setSize = scanner.nextInt();
            int noOps = scanner.nextInt();
            BitSet[] bitSets = new BitSet[]{new BitSet(setSize), new BitSet(setSize)};
            Map<String, BiConsumer<Integer, Integer>> ops = new HashMap<>();
            ops.put("AND", (index1, index2) -> bitSets[index1 - 1].and(bitSets[index2 - 1]));
            ops.put("OR", (index1, index2) -> bitSets[index1 - 1].or(bitSets[index2 - 1]));
            ops.put("XOR", (index1, index2) -> bitSets[index1 - 1].xor(bitSets[index2 - 1]));
            ops.put("SET", (index1, index2) -> bitSets[index1 - 1].set(index2));
            ops.put("FLIP", (index1, index2) -> bitSets[index1 - 1].flip(index2));
            for (int i = 0; i < noOps; i++) {
                ops.get(scanner.next()).accept(scanner.nextInt(), scanner.nextInt());
                System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
            }
        }
    }
}
