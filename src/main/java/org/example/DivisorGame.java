package org.example;

public class DivisorGame {
    public static void main(String[] args) {
        System.out.println(divisorGame(2));
        System.out.println(divisorGame(3));

    }

    public static boolean divisorGame(int n) {
        int muvesNum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                muvesNum++;
                n -= i;
                i = 0;
            }
        }
        return muvesNum % 2 != 0;
    }
}
