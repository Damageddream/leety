package org.example;

import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hMap.containsKey(nums[i])) {
                hMap.remove(nums[i]);
            }else{
                hMap.put(nums[i], 1);
            }
        }
        return hMap.keySet().stream().iterator().next();
    }
}
