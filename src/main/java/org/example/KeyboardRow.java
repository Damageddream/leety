package org.example;

import java.util.*;

public class KeyboardRow {
    public static void main(String[] args) {
        String[] wordsOne = {"Hello", "Alaska", "Dad", "Peace"};
        String[] wordsTwo = {"omk"};
        String[] wordsThree = {"adsdf", "sfd"};
        String[] wordsFour = {"a", "b"};
//        System.out.println(Arrays.toString(findWords(wordsOne)));
//        System.out.println(Arrays.toString(findWords(wordsTwo)));
//        System.out.println(Arrays.toString(findWords(wordsThree)));
        System.out.println(Arrays.toString(findWords(wordsFour)));

    }

    public static String[] findWords(String[] words) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        Set<Character> firstRowSet = new HashSet<>();
        Set<Character> secondRowSet = new HashSet<>();
        Set<Character> thirdRowSet = new HashSet<>();
        for (int i = 0; i < firstRow.length(); i++) {
            firstRowSet.add(firstRow.charAt(i));
        }
        for (int i = 0; i < secondRow.length(); i++) {
            secondRowSet.add(secondRow.charAt(i));
        }
        for (int i = 0; i < thirdRow.length(); i++) {
            thirdRowSet.add(thirdRow.charAt(i));
        }
        List<String> wordsInOneRow = new ArrayList<>();

        for (String word : words) {
            String formattedWord = word.trim().toLowerCase();
            Set<Character> checkSet;
            if (firstRowSet.contains(formattedWord.charAt(0))) {
                checkSet = firstRowSet;
            } else if (secondRowSet.contains(formattedWord.charAt(0))) {
                checkSet = secondRowSet;
            } else if (thirdRowSet.contains(formattedWord.charAt(0))) {
                checkSet = thirdRowSet;
            } else {
                continue;
            }
            int lettersInRow = 0;
            for (int i = 0; i < formattedWord.length(); i++) {
                if (checkSet.contains(formattedWord.charAt(i))) {
                    lettersInRow += 1;
                }
            }
            if (lettersInRow == formattedWord.length()) {
                wordsInOneRow.add(word);
            }
        }
        String[] output = new String[wordsInOneRow.size()];
        for (int i = 0; i < wordsInOneRow.size(); i++) {
            output[i] = wordsInOneRow.get(i);
        }

        return output;
    }
}
