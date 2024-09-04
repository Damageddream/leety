package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class ReforamtString {
    public static void main(String[] args) {
        System.out.println(reformat("a0b1c2"));
        System.out.println(reformat("leetcode"));
        System.out.println(reformat("1229857369"));
        System.out.println(reformat("covid2019"));

    }

    public static String reformat(String s) {
        if (s.length() == 1) {
            return s;
        }
        Queue<Character> alpha = new LinkedList<>();
        Queue<Character> numeric = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                alpha.add(s.charAt(i));
            } else {
                numeric.add(s.charAt(i));
            }
        }
        if (Math.abs(alpha.size() - numeric.size()) > 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int alpSize = alpha.size();
        int numSize = numeric.size();
        if (alpSize > numSize) {
            for (int i = 0; i < alpSize; i++) {
                sb.append(alpha.poll());
                if (i != alpSize - 1) {
                    sb.append(numeric.poll());
                }

            }
        } else if (alpSize == numSize) {
            for (int i = 0; i < alpSize; i++) {
                sb.append(alpha.poll());
                sb.append(numeric.poll());
            }
        } else {
            for (int i = 0; i < numSize; i++) {
                sb.append(numeric.poll());
                if (i != numSize - 1) {
                    sb.append(alpha.poll());
                }
            }
        }
        return sb.toString();
    }
}
