package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class RomanNums {
    public static void main(String[] args) {
        System.out.println(romanToInt("III") == 3);
        System.out.println(romanToInt("LVIII") == 58);
        System.out.println(romanToInt("MCMXCIV") == 1994);


    }

    public static int romanToInt(String s) {
        List<String> potenialSubt = List.of("I", "X", "C");
        Map<String, Integer> romanValues = Map.ofEntries(Map.entry("I", 1), Map.entry("IV", 4),
                Map.entry("V", 5), Map.entry("IX", 9),
                Map.entry("X", 10), Map.entry("XL", 40), Map.entry("L", 50), Map.entry("XC", 90), Map.entry("C", 100),
                Map.entry("CD", 400), Map.entry("D", 500), Map.entry("CM", 900), Map.entry("M", 1000));
        Set<String> romanValKeys = romanValues.keySet();

        int output = 0;
        String[] arrayOfS = s.split("");
        for (int i = 0; i < arrayOfS.length; i++) {
            if (potenialSubt.contains(arrayOfS[i]) && arrayOfS.length - 1 != i) {
                String checkForSubst = arrayOfS[i] + arrayOfS[i + 1];
                if (romanValKeys.contains(checkForSubst)) {
                    output += romanValues.get(checkForSubst);
                    i += 1;
                    continue;
                }
            }
            output += romanValues.get(arrayOfS[i]);
        }

        return output;
    }
}
