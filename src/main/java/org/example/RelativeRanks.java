package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {
    public static void main(String[] args) {
        int[] test1 = {10,3,8,9,4};
        System.out.println(Arrays.toString(findRelativeRanks(test1)));
    }

    public static String[] findRelativeRanks(int[] score) {
        Map<Integer, Integer> rankMap = new HashMap<>();
        for (int i = 0; i < score.length; i++) {
            rankMap.put(score[i], i);
        }
        int[] sortedScore = Arrays.stream(score)
                .boxed().sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        String[] output = new String[score.length];
        for (int i = 0; i < sortedScore.length; i++) {
            if (i == 0) {
                output[rankMap.get(sortedScore[i])] = "Gold Medal";
            } else if (i == 1) {
                output[rankMap.get(sortedScore[i])] = "Silver Medal";
            } else if (i == 2) {
                output[rankMap.get(sortedScore[i])] = "Bronze Medal";
            } else {
                output[rankMap.get(sortedScore[i])] = Integer.toString(i+1);
            }

        }
        return output;
    }
}
