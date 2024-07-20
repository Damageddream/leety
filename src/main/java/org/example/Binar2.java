package org.example;

public class Binar2 {
    public static void main(String[] args) {
        int[] test1 = {-1,0,3,5,9,12};
        System.out.println(binarySearch(test1,9));

    }
    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right + left) / 2;
            int temp = nums[mid];
            if (target == temp) {
                return mid;
            }
            if (target <= temp) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}
