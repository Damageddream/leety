package org.example;

public class maxConsOnes {
    public static void main(String[] args) {
        int[] test = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(test));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int longest = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp += 1;
            } else if (nums[i] == 0) {
                longest = Math.max(temp, longest);
                temp = 0;
            }
            longest = Math.max(temp, longest);
        }
        return longest;
    }
}
