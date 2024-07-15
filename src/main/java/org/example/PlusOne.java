package org.example;

public class PlusOne {
    public static void main(String[] args) {

    }

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newNums = new int[digits.length + 1];
        newNums[0] = 1;
        return newNums;
    }

}
