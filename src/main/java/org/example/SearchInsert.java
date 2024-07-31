package org.example;

public class SearchInsert {
    public static void main(String[] args) {
        int[] numsy = {1,2,3,4,5,6,7,8,9,10,11
        ,12,13,14,15,16,17,18,19,20,21,22,23,24};
        System.out.println(searchInsert(numsy, 25));
    }

    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid-1;
            else start = mid+1;
        }

        return start;
    }
}
