package org.example;

public class SlidingWindow {

    public static int maxSubbaraySum(int[] nums, int k){
        int maxSum = Integer.MIN_VALUE;
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }


    public static void main(String[] args) {
        int[] nums = {2,1,5,1,3,2};
        int wndowsSize = 3;
        int result = maxSubbaraySum(nums, wndowsSize);
        System.out.println("Max subaaray sum: " + result);
    }
}
