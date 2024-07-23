package org.example;

public class BinarSearch {
    public static void main(String[] args) {
        int[] test1 = {-1,0,3,5,9,12};
        System.out.println(search(test1,9));

    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            int temp = nums[mid];
            if(temp == target){
                return mid;
            }
            if(target < temp){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
