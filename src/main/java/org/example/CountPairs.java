package org.example;

import java.util.Collections;
import java.util.List;

public class CountPairs {
    public static void main(String[] args) {
        List<Integer> test1 = List.of(-1,1,2,3,1);
        List<Integer> test2 = List.of(-6,2,5,-2,-7,-1,3);
        System.out.println(countPairs(test2, -2));

    }
    public static int countPairs(List<Integer> nums, int target) {
        int pairsnum = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i+1; j < nums.size(); j++) {
                if(nums.get(i)+nums.get(j) < target){
                    pairsnum += 1;
                }
            }
        }
        return pairsnum;
    }
}
