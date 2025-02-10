package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LargestGroup {
    public static void main(String[] args) {
        String test = "ab-cd";
        String test2 = "a-bC-dEf-ghIj";
        String test3 = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(test));
        System.out.println(reverseOnlyLetters(test2));
        System.out.println(reverseOnlyLetters(test3));

    }

    public static String reverseOnlyLetters(String s) {
        Stack<Character> letters = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))){
                letters.push(s.charAt(i));
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if(Character.isAlphabetic(s.charAt(i))){
                builder.append(letters.pop());
            } else {
                builder.append(s.charAt(i));
            }
        }
        return builder.toString();
    }
}
