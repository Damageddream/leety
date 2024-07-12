package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


//Given two integer arrays nums1 and nums2, return an array of their intersection.
// Each element in the result must appear as many times as it shows in both arrays and
//  you may return the result in any order.
public class Interserction {
    public static void main(String[] args) {
        int[] test1 = {1,2,2,1};
        int[] test1v2 = {2,2};
        int[] otuput1 = {2,2};

        int[] test2 = {4,9,5};
        int[] test2v2 = {9,4,9,8,4};
        int[] output2 = {9,4};

        System.out.println(Arrays.equals(intersect(test1,test1v2), otuput1));
        System.out.println(Arrays.equals(intersect(test2,test2v2), output2));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> trackNums = new HashMap<>();

        for (int i : nums1) {
            int temp = trackNums.getOrDefault(i, 0);
            trackNums.put(i, temp+1);
        }
        ArrayList<Integer> output = new ArrayList<>();
        for (int i : nums2) {
            if(trackNums.get(i) != null && trackNums.get(i) > 0){
                output.add(i);
                trackNums.put(i, trackNums.get(i)-1);
            }
        }
        int[] intersect = new int[output.size()];
        for (int i = 0; i < output.size(); i++) {
            intersect[i] = output.get(i);
        }
        return intersect;
    }
}
