package org.example;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrPart {
    public static void main(String[] args) {
        int[] test1 = {1,4,3,2};
        int[] test2 = {6,2,6,5,1,2};

        System.out.println(arrayPairSum(test1));
        System.out.println(arrayPairSum(test2));

    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if((i+1)%2==0){
              sum += nums[i-1];
            }
        }
        return sum;
    }
}
