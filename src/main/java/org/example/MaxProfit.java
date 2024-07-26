package org.example;

public class MaxProfit {
    public static void main(String[] args) {
        int[] test = {1,7,4,11,8,23,5};

    }

    public static int maxProfit(int[] prices){
        int minPrice = 0;
        int maxProfit = 0;

        for (int price : prices) {
            if(minPrice > price){
                minPrice = price;
            }
            if(price - minPrice > maxProfit){
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
}
