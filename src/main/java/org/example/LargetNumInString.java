package org.example;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargetNumInString {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("52"));
        System.out.println(largestOddNumber("4206"));
        System.out.println(largestOddNumber("35427"));
        System.out.println(largestOddNumber("239537672423884969653287101"));

    }

    public static String largestOddNumber(String num) {
        int lastOddNumIndex = -1;
        for (int i = 0; i < num.length(); i++) {
            if (i == num.length() - 1 && Integer.parseInt(String.valueOf(num.charAt(i))) % 2 != 0) {
                return num;
            }
            if (Integer.parseInt(String.valueOf(num.charAt(i))) % 2 != 0) {
                lastOddNumIndex = i;
            }
        }
        Set<Integer> sety = new HashSet<>();
        return lastOddNumIndex == -1 ? "" : num.substring(0, lastOddNumIndex + 1);
    }
}
