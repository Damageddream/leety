package org.example;

import java.util.Arrays;

public class SmallestRange {
    public static void main(String[] args) {

    }

    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int out = (nums[nums.length - 1] - k) - (nums[0] + k);
        return Math.max(out, 0);
    }
}
