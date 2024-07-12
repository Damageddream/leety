package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] test1 = {2,7,11,15};
        int[] test1out = {0,1};
        int[] test2 = {3,2,4};
        int[] test2out = {1,2};
        int[] test3 = {3,3};
        int[] test3out = {0,1};

        System.out.println(Arrays.equals(twoSum(test1,9),test1out));
        System.out.println(Arrays.equals(twoSum(test2,6),test2out));
        System.out.println(Arrays.equals(twoSum(test3,6),test3out));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hMap.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int cont = target - nums[i];
            if(hMap.containsKey(cont) && hMap.get(cont) != i){
                return new int[]{i, hMap.get(cont)};
            }
        }
            return new int[]{};
    }
}
