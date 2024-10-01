package org.example;

import java.util.Arrays;

public class SignOfAProduct {
    public static void main(String[] args) {
        int[] test = {-1,-2,-3,-4,3,2,1};
        int[] test1 = {1,5,0,2,-3};
        int[] test2 = {-1,1,-1,1,-1};
        int[] test3 = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        System.out.println(arraySign(test));
        System.out.println(arraySign(test1));
        System.out.println(arraySign(test2));
        System.out.println(arraySign(test3));

    }

    public static int arraySign(int[] nums) {
        int prod = nums[0];
        int negNums = 0;

        if (nums.length == 1) {
            if (prod == 0) {
                return 0;
            }
            return prod > 0 ? 1 : -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                return 0;
            }
            if(nums[i]<0){
                negNums++;
            }
        }
        if(negNums == 0){
            return 1;
        }
        if(negNums%2==0){
            return 1;
        }
        return -1;
    }
}
