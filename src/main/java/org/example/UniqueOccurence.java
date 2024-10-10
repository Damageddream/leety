package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurence {
    public static void main(String[] args) {

    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> trackOccurences = new HashMap<>();
        for (int num : arr) {
            trackOccurences.put(num, trackOccurences.getOrDefault(num, 0)+1);
        }
        Set<Integer> uniqueOccur = new HashSet<>();
        for (Integer num : trackOccurences.keySet()) {
            if(!uniqueOccur.add(trackOccurences.get(num))){
                return false;
            }

        }
        return true;
    }
}
