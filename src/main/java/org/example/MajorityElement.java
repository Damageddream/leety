package org.example;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int n = nums.length/2;
        HashMap<Integer,Integer> trackNums = new HashMap<>();
        for (int num : nums) {
            trackNums.put(num, trackNums.getOrDefault(num, 0)+1);
            if(trackNums.get(num)>n){
                return num;
            }
        }
        return  -1;
    }
}
