package org.example;

import java.util.HashMap;

public class LongestHarmoniusSubsequence {
    public static void main(String[] args) {
        int[] test1 = {1,3,2,2,5,2,3,7};
        int[] test2 = {1,2,3,4};
        int[] test3 = {1,1,1,1};

        System.out.println(findLHS(test1) == 5);
        System.out.println(findLHS(test2) == 2);
        System.out.println(findLHS(test3) == 0);


    }
    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> checkLHS = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            checkLHS.put(nums[i], checkLHS.getOrDefault(nums[i],0)+1);
        }
        int max = 0;
        for (Integer key : checkLHS.keySet()) {
            if(checkLHS.keySet().contains(key+1)){
                max = Math.max(max, checkLHS.get(key) + checkLHS.get(key+1));
            }
        }
        return max;
    }
}
