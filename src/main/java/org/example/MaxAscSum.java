package org.example;

public class MaxAscSum {
    public static void main(String[] args) {

        int[] test = {3,6,10,1,8,9,9,8,9};
        int[] test2 = {10,20,30,40,50};
        int[] test3 = {12,17,15,13,10,11,12};

        System.out.println(maxAscendingSum(test));
        System.out.println(maxAscendingSum(test2));
        System.out.println(maxAscendingSum(test3));

    }
    public static int maxAscendingSum(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int largestSum = 0;
        int tempSum = nums[0];
        for (int i = 1; i < nums.length; i++) {

            int current = nums[i];
            int prev = nums[i-1];
            if(current > prev){
                tempSum += current;
            } else {
                largestSum = Math.max(largestSum,tempSum);
                tempSum = nums[i];
            }
        }
        
        return Math.max(largestSum,tempSum);
    }
}
