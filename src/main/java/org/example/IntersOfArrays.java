package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersOfArrays {
    public static void main(String[] args) {
        int[] test = {4,7,9,7,6,7};
        int[] testSec = {5,0,0,6,1,6,2,2,4};
        int[] test2 = {4,9,5};
        int[] test2Sec = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(test, testSec)));
        System.out.println(Arrays.toString(intersection(test2, test2Sec)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> track = new HashSet<>();
        Set<Integer> out = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            track.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if(track.contains(nums2[i])){
                out.add(nums2[i]);
            }
        }
        int[] output = new int[out.size()];
        int index = 0;
        for (Integer num : out) {
            output[index] = num;
            index++;
        }
        return output;
    }
}
