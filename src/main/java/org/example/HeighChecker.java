package org.example;

import java.util.Arrays;

public class HeighChecker {
    public static void main(String[] args) {

    }
    public static int heightChecker(int[] heights) {
        int[] notSorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(heights);
        int counter = 0;
        for (int i = 0; i < heights.length; i++) {
            if(notSorted[i] != heights[i]){
                counter++;
            }
        }
        return counter;
    }
}
