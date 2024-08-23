package org.example;

import java.util.HashSet;
import java.util.Set;

public class MissingNum {
    public static void main(String[] args) {
        int[] test = {3,0,1};
        int[] test1 = {0,1};
        int[] test2 = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(test));
        System.out.println(missingNumber(test1));
        System.out.println(missingNumber(test2));

    }
    public static int missingNumber(int[] nums) {
        int output = -1;
        Set<Integer> range = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            range.add(nums[i]);
        }
        for (int i = 0; i < nums.length+1; i++) {
            if(!range.contains(i)){
                output = i;
            }
        }
        return output;
    }
}
