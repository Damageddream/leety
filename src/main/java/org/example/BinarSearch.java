package org.example;

public class BinarSearch {
    public static void main(String[] args) {
        int[] test1 = {-1,0,3,5,9,12};
        System.out.println(search(test1,9));

    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            int temp = nums[mid];
            if(temp == target){
                return mid;
            }
            if(target < temp){
                end = mid-1;
            }else{
               start = mid+1;
            }
        }
        return -1;
    }
}
