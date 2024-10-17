package org.example;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] splittedS = s.split(" ");
        String[] reversedWords = new String[splittedS.length];
        for (int i = 0; i < splittedS.length; i++) {
            String word = splittedS[i];
            String reversedWord = "";
            for (int j = word.length()-1; j > -1; j--) {
                reversedWord += word.charAt(j);
            }
            reversedWords[i] = reversedWord;
        }
        return String.join(" ",reversedWords);
    }
}
