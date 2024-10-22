package org.example;

import java.util.HashMap;
import java.util.Map;

public class MaxLength {
    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters("aa"));
        System.out.println(maxLengthBetweenEqualCharacters("abca"));
        System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));

    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> charAndIndexMap = new HashMap<>();
        int maxLength = -1;
        for (int i = 0; i < s.length(); i++) {
            Integer temp = charAndIndexMap.put(s.charAt(i), i);
            if(temp != null){
                maxLength = Math.max(maxLength,i-(temp+1));
                charAndIndexMap.clear();
            }
        }
        return maxLength;
    }
}
