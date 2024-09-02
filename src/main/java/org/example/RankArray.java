package org.example;

import java.util.*;

public class RankArray {
    public static void main(String[] args) {
        int[] test = {40, 10, 20, 30};
        int[] test1 = {100, 100, 100};
        int[] test2 = {37, 12, 28, 9, 100, 56, 80, 5, 12};

//        System.out.println(Arrays.toString(arrayRankTransform(test)));
//        System.out.println(Arrays.toString(arrayRankTransform(test1)));
        System.out.println(Arrays.toString(arrayRankTransform(test2)));

    }

    public static int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> mapArr = new HashMap<>();
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr);
        int index = 1;
        for (int i = 0; i < arr.length; i++) {
            if(!mapArr.containsKey(arr[i])){
                mapArr.put(arr[i], index++);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mapArr.get(arrCopy[i]);
        }
        return arr;
    }
}
