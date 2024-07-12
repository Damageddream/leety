package org.example;

import java.lang.reflect.Array;

public class AddPalindrome {
    public static void main(String[] args) {
        String testA = "A man, a plan, a canal: Panama";
        String testB = "race a car";
        String testC = " ";
        System.out.println(isPalindrome(testA) == true);
        System.out.println(isPalindrome(testB) == false);
        System.out.println(isPalindrome(testC) == true);

    }
    public static boolean isPalindrome(String s) {
        String cleanedS = s.trim().toLowerCase();
        if(s.isEmpty()){
            return true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : cleanedS.toCharArray()) {
            if(Character.isAlphabetic(c) || Character.isDigit(c)){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString().contentEquals(stringBuilder.reverse());
    }
}
