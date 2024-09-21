package org.example;

import java.util.HashSet;
import java.util.Set;

public class Panagram {
    public static void main(String[] args) {

    }
    public static boolean checkIfPangram(String sentence) {
        Set<Character> allLetters = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            allLetters.add(c);
        }
        for (int i = 0; i < sentence.length(); i++) {
            if(allLetters.contains(Character.toLowerCase(sentence.charAt(i)))){
                allLetters.remove(Character.toLowerCase(sentence.charAt(i)));
            }
            if(allLetters.isEmpty()){
                return true;
            }
        }
        return false;
    }
}
