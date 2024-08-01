package com.CodeHelp.C1_Arrays;

/*
https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */


public class C10_BestTimeToSellStock_LEETCODE {

    public static void main(String[] args) {

        int[] data = {1,2,4};
        System.out.println(maxProfit(data));

    }

    public static int maxProfit(int[] prices) {

        int leftPointer = 0;
        int rightPointer = 1;
        int maxProfit = 0;

        while (rightPointer<prices.length) {

            if (prices[leftPointer]<prices[rightPointer]) {
                int profit = prices[rightPointer]-prices[leftPointer];
                if (profit >maxProfit) {
                    maxProfit = profit;
                }
                rightPointer++;

            }else {
                leftPointer = rightPointer;
                rightPointer++;
            }

        }
        return maxProfit;

    }
}
