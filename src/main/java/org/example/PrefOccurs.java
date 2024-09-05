package org.example;

import java.util.Arrays;

public class PrefOccurs {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("i love eating burger", "burg"));

    }
    public static int isPrefixOfWord(String sentence, String searchWord) {
        String[] split = sentence.split(" ");
        for (int i = 0; i < split.length; i++) {
            if(split[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}
