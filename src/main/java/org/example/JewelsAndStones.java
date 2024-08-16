package org.example;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {

    }

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> jewelsSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelsSet.add(jewels.charAt(i));
        }
        for (int j = 0; j < stones.length(); j++) {
            if(jewelsSet.contains(stones.charAt(j))){
                count++;
            }
        }
        return count;
    }
}
