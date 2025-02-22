package org.example;

import java.util.ArrayList;
import java.util.List;

public class Anagra {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));

    }

    public static boolean isAnagram(String s, String t) {

        List<Character> sStr = new ArrayList<>();
        sStr.sort(((a,b) -> {
            if(a == b){
                return 0;
            }
            return a>b? -1:1;
        }));

        if(s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            sStr.add(s.charAt(i));
        }

        for (int i = 0; i < t.length(); i++) {
            if(!sStr.contains(t.charAt(i))){
                return false;
            } else {
                sStr.remove(sStr.lastIndexOf(t.charAt(i)));
            }
        }

        return true;
    }

}
