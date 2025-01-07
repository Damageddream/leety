package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class WidestArea {
    public static void main(String[] args) {
        int[][] test = {{8,7},{9,9},{7,4},{9,7}};
        System.out.println(maxWidthOfVerticalArea(test));
    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        List<Integer> onlyX = new ArrayList<>();
        for (int[] point : points) {
            onlyX.add(point[0]);
        }
        onlyX.sort(Integer::compareTo);
        int width = 0;
        int prev = onlyX.get(0);
        for (int i = 1; i < onlyX.size(); i++) {
            int temp = onlyX.get(i);
            if(temp - prev > width){
                width = temp - prev;
            }
            prev = temp;
        }
        return width;
    }
}
