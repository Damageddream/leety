package org.example;

public class FindNum {
    public static void main(String[] args) {
        int[] test = {12,345,2,6,7896};
        System.out.println(findNumbers(test));

    }

    public static int findNumbers(int[] nums) {
        int numOfEven = 0;

        for (int num : nums) {
            String temp = String.valueOf(num);
            if(temp.length()%2 ==0 ){
                numOfEven++;
            }
        }

        return numOfEven;
    }
}
