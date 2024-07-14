package org.example;

import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

    }
    public static int removeElement(int[] nums, int val) {
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val){
                out.add(nums[i]);
            }
        }
        for (int i = 0; i < out.size(); i++) {
            nums[i] = out.get(i);
        }
        return out.size();
    }
}
