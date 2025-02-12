package org.example;

public class MinDistance {
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4,5};
        int[] test2 = {1};
        int[] test3 = {1,1,1,1,1,1,1,1,1,1};
        System.out.println(getMinDistance(test1,5,3));
        System.out.println(getMinDistance(test2,1,0));
        System.out.println(getMinDistance(test3,1,0));

    }

    public static int getMinDistance(int[] nums, int target, int start) {

        int minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                minDistance = Math.min(minDistance, Math.abs(i - start));
            }
        }
        return minDistance;
    }
}
