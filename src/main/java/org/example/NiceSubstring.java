package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NiceSubstring {
    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("YazaAay"));
        System.out.println(longestNiceSubstring("Bb"));
        System.out.println(longestNiceSubstring("c"));
    }

    public static String longestNiceSubstring(String s) {
        Set<Character> allCharacters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            allCharacters.add(s.charAt(i));
        }
        while (true) {
            Set<Character> tempSet = new HashSet<>();
            StringBuilder sb = new StringBuilder();
            String longestString = "";
            String tempString = "";
            for (int i = 0; i < s.length(); i++) {
                if (allCharacters.contains(Character.toLowerCase(s.charAt(i)))
                        && allCharacters.contains(Character.toUpperCase(s.charAt(i)))) {
                    sb.append(s.charAt(i));
                    tempSet.add(s.charAt(i));
                } else {
                    tempString = sb.toString();
                    sb.setLength(0);
                    boolean isNiceSubstring = true;
                    for (int j = 0; j < tempString.length(); j++) {
                        if (!(tempSet.contains(Character.toLowerCase(tempString.charAt(j)))
                                && tempSet.contains(Character.toUpperCase(tempString.charAt(j))))) {
                            isNiceSubstring = false;
                            break;
                        }
                    }
                    if (isNiceSubstring) {
                        longestString = tempString.length() > longestString.length() ? tempString : longestString;
                    }
                }
            }
            return longestString;
        }
    }
}
