package org.example;

public class DigitWon {

    public static void main(String[] args) {

    }


    public static boolean canAliceWin(int[] nums) {
        int sumSingleDitit = 0;
        int sumDoubleDigit = 0;
        for (int num : nums) {
            if(num > 9){
                sumDoubleDigit += num;
            } else {
                sumSingleDitit += num;
            }
        }
        return sumDoubleDigit != sumSingleDitit;
    }
}
