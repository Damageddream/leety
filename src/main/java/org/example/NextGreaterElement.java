package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] num1Test1 = {4, 1, 2};
        int[] num2Test1 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(num1Test1, num2Test1)));

    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums2HashMap = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            nums2HashMap.put(nums2[i], i);
        }
        int[] output = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int indexInNums2 = nums2HashMap.get(nums1[i]);
            int temp = nums2[indexInNums2];
            for (int j = indexInNums2; j < nums2.length; j++) {
                if (nums2[j] > temp) {
                    output[i] = nums2[j];
                    temp = nums2[j];
                    break;
                }
            }
            if (nums1[i] == temp) {
                output[i] = -1;
            }
        }
        return output;
    }
}
