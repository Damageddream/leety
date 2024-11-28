package org.example;

import java.util.List;

public class ComChar {
    public static void main(String[] args) {
        String[] words1 = {"cat","bt","hat","tree"};
        String chars1 = "atach";
        String[] words2 = {"hello","world","leetcode"};
        String chars2 = "welldonehoneyr";
        System.out.println(countCharacters(words1,chars1));
        System.out.println(countCharacters(words2,chars2));

    }

    public static int countCharacters(String[] words, String chars) {
        StringBuilder builder = new StringBuilder(chars);
        int sumOfLengths = 0;
        for (String word : words) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                int indexOfChar = builder.indexOf(String.valueOf(word.charAt(i)));
                if(indexOfChar == -1){
                    break;
                }
                count++;
                builder.deleteCharAt(indexOfChar);
            }
            if(count == word.length()){
                sumOfLengths += word.length();
            }
            builder.setLength(0);
            builder.append(chars);
        }
        return sumOfLengths;
    }
}
