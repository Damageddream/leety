package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqeMorse {
    public static void main(String[] args) {

    }
    public int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> morseCodeMap = new HashMap<>();
        String[] morseCodes = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--.."
        };
        for (int i = 0; i < morseCodes.length; i++) {
            char letter = (char) ('a' + i);
            morseCodeMap.put(letter, morseCodes[i]);
        }

        StringBuilder sb = new StringBuilder();

        Set<String> uniqueMorseCodes = new HashSet<>();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                sb.append(morseCodeMap.get(word.charAt(i)));
            }
            uniqueMorseCodes.add(sb.toString());
            sb.setLength(0);
        }
        return uniqueMorseCodes.size();
    }
}
