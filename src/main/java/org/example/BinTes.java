package org.example;

public class BinTes {
    public static void main(String[] args) {
        int[] test1 = {1,4,6,9,12,15,28};
        System.out.println(binarySearch(test1, 30));
    }

    public static int binarySearch(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (right + left) / 2;
            int tempInt = nums[mid];
            if(tempInt == target){
                return mid;
            }
            if(tempInt > target) {
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
