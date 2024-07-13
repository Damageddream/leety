package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            boolean temp = numsSet.add(nums[i]);
            if(temp){
                out.add(nums[i]);
            }
        }
        for (int i = 0; i < out.size(); i++) {
            nums[i] = out.get(i);
        }
        return out.size();
    }
}
