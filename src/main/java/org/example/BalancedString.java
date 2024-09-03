package org.example;

public class BalancedString {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));

    }

    public static int balancedStringSplit(String s) {
        int balance = 0;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            balance = s.charAt(i) == 'L' ? ++balance : --balance;
            if (balance == 0) {
                result++;
            }
        }
        return result;
    }
}
