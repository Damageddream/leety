package org.example;

public class Stock {
    public static void main(String[] args) {
        int[] test = {7,1,5,3,6,4};
        int[] test2 = {7,6,4,3,1};
        System.out.println(maxProfit(test));
        System.out.println(maxProfit(test2));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bestBuyPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            bestBuyPrice = Math.min(bestBuyPrice, prices[i]);
            if(maxProfit < prices[i] - bestBuyPrice){
                maxProfit = prices[i] - bestBuyPrice;
            }

        }
        return maxProfit;
    }
}
