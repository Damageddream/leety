package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class AvreageSubbarray {
    public static void main(String[] args) {
        int[] test1 = {1, 12, -5, -6, 50, 3};
        int[] test2 = {5};
        int[] test3 = {4,0,4,3,3};
        System.out.println(findMaxAverage(test1, 4));
        System.out.println(findMaxAverage(test2, 1));
        System.out.println(findMaxAverage(test3, 5)); //2.8000
    }

    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int sumMax = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum+nums[i] - nums[i-k];
            sumMax = Math.max(sumMax,sum);
        }
        return (double) sumMax/k;
    }
}
