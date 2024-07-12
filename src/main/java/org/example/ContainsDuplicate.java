package org.example;

import java.util.*;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] test1arr = {1, 2, 3, 1};
        int test1k = 3;

        int[] test2arr = {1, 0, 1, 1};
        int test2k = 1;

        int[] test3arr = {1, 2, 3, 1, 2, 3};
        int test3k = 2;

        System.out.println(containsNearbyDuplicate(test1arr, test1k) == true);
        System.out.println(containsNearbyDuplicate(test2arr, test2k) == true);
        System.out.println(containsNearbyDuplicate(test3arr, test3k) == false);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> trackDuplicates = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            var check = trackDuplicates.put(nums[i], i);
            if(check != null){
                if(trackDuplicates.get(nums[i]) - check <= k){
                    return true;
                }
            }
        }
        return false;
    }
}
