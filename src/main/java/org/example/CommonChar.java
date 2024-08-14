package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonChar {
    public static void main(String[] args) {
        String[] word = {"bella","label","roller"};
        String[] word2 = {"cool","lock","cook"};
        System.out.println(commonChars(word));
        System.out.println(commonChars(word2));

    }

    public static List<String> commonChars(String[] words) {
        Map<Character, Integer> trackChars = new HashMap<>();
        List<String> output = new ArrayList<>();
        for (int i = 0; i < words[0].length(); i++) {
            trackChars.put(words[0].charAt(i), trackChars.getOrDefault(words[0].charAt(i), 0) + 1);
        }

        if (words.length > 1) {
            for (int i = 1; i < words.length; i++) {
                Map<Character, Integer> innerMap = new HashMap<>();
                for (int j = 0; j < words[i].length(); j++) {
                    innerMap.put(words[i].charAt(j), innerMap.getOrDefault(words[i].charAt(j), 0) + 1);

                }
                for (Character innerChar : trackChars.keySet()) {
                    if (innerMap.keySet().contains(innerChar)) {
                        if (innerMap.get(innerChar) < trackChars.get(innerChar)) {
                            trackChars.put(innerChar, innerMap.get(innerChar));
                        }
                    } else {
                        trackChars.remove(innerChar);
                    }
                }
            }
            for (Character word : trackChars.keySet()) {
                for (Integer i = 0; i < trackChars.get(word); i++) {
                    output.add(Character.toString(word));
                }
            }
        }
        return output;
    }
}
