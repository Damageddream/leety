package org.example;

import java.util.*;

public class SortIncreaseFrequeance {
    public static void main(String[] args) {

    }
    public static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> mapping = new HashMap<>();
        for (int num : nums) {
            mapping.put(num, mapping.getOrDefault(num,0)+1);
        }
        return Arrays.stream(nums).boxed()
                .sorted((a,b) -> mapping.get(a) != mapping.get(b) ? mapping.get(a) - mapping.get(b) : b - a)
                .mapToInt(n -> n)
                .toArray();
    }
}
