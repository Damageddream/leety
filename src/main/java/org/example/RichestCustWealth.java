package org.example;

public class RichestCustWealth {
    public static void main(String[] args) {

    }

    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, temp);
        }

        return maxWealth;
    }
}
