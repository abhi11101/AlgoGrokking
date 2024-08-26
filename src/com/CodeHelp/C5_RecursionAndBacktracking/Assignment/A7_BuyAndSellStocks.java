package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

public class A7_BuyAndSellStocks {

    public static void main(String[] args) {

        int[] arr = {7,1,5,3,6,4};
        int[] arr2 = {7,6,4,3,1};

        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr2));

    }


    public static int maxProfit(int[] prices) {

        return findMaxProfit(prices,0,1,0);

    }

    public static int findMaxProfit(int[] prices, int buyTime, int sellTime, int max) {

        if (sellTime>=prices.length){
            return max;
        }

        if (prices[sellTime]>prices[buyTime]){
            int profit = prices[sellTime]-prices[buyTime];

            if (profit>max){
                max=profit;
            }
            return findMaxProfit(prices,buyTime,sellTime+1,max);
        }
        else {
            return findMaxProfit(prices,sellTime,sellTime+1,max);
        }


    }

}
