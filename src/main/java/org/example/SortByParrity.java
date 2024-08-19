package org.example;

import java.util.Arrays;

public class SortByParrity {
    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int oddIndex = 0;
        int evenIndex = nums.length - 1;

        for (int num : nums) {
            if (num % 2 == 0) {
                result[oddIndex++] = num;
            } else {
                result[evenIndex--] = num;
            }
        }

        return result;
    }
}
