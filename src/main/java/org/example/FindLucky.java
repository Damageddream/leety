package org.example;

import java.util.*;

public class FindLucky {
    public static void main(String[] args) {
        int[] test = {2,2,3,4};
        int[] test2 = {1,2,2,3,3,3};
        int[] test3= {2,2,2,3,3};
        System.out.println(findLucky(test));
        System.out.println(findLucky(test2));
        System.out.println(findLucky(test3));

    }
    public static int findLucky(int[] arr) {
        Map<Integer, Integer> numbersMap = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            numbersMap.put(arr[i],numbersMap.getOrDefault(arr[i], arr[i])-1);
        }
        for (Integer key : numbersMap.keySet()) {
            if(numbersMap.get(key) == 0){
                return key;
            }
        }
        return -1;
    }
}
