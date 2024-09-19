package com.practice.array;

public class BuySellStock {

    public static void main(String[] args) {
        //int[] prices = {7,1,5,3,6,4};
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];
        int arrLength = prices.length;

        for (int i=1; i<arrLength; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else {
                int profit = prices[i] - minPrice;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
