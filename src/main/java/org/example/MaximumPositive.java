package org.example;

public class MaximumPositive {
    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{1,4,8,9,11,15,13}));

    }

    public static int maximumCount(int[] nums) {
        int target = 9;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            int temp = nums[mid];
            if(target == temp){
                return mid;
            }
            if(target < temp){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
