package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestCommon {
    public static void main(String[] args) {
        String[] wordsPrefix = {"flower", "flow", "flight"};
        String outputPrefix = "fl";
        String[] wordsEmpt = {"dog", "racecar", "car"};
        String outputEmpt = "";
        String assertPre = longestCommonPrefix(wordsPrefix);
        System.out.println(outputPrefix.equals(assertPre));
        String assertEmpt = longestCommonPrefix(wordsEmpt);
        System.out.println(outputEmpt.equals(assertEmpt));
    }

    public static String longestCommonPrefix(String[] strs) {
        String shortestWord = Arrays.stream(strs).min(Comparator.comparing(String::length)).get();
        int commonPrefixLength = 0;
        for (int i = 0; i < shortestWord.length(); i++) {
            int wordsWithCommonPrefix = 0;
            for (String word : strs) {
                char letter = shortestWord.charAt(i);
                if (letter == word.charAt(i)) {
                    wordsWithCommonPrefix += 1;
                } else {
                    return commonPrefixLength > 0 ? shortestWord.substring(0, commonPrefixLength) : "";
                }
            }
            if (wordsWithCommonPrefix+1 == shortestWord.length()) {
                commonPrefixLength += 1;
            }
        }

        return commonPrefixLength > 0 ? shortestWord.substring(0, commonPrefixLength) : "";
    }
}
