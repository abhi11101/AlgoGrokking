package com.CodeHelp.C15_DynamicProgramming;

import java.util.Arrays;

/*
https://leetcode.com/problems/coin-change/
 */
public class C2_CoinChange_LEETCODE {

    public static void main(String[] args) {

        int[] coins = {3, 2, 5};
        System.out.println(coinChangeUsingRecursion(coins, 11));
        System.out.println(coinChangeTopDown(coins, 11));
        System.out.println(bottomUpApproach(coins, 11));

    }

    public static int coinChangeUsingRecursion(int[] coins, int amount) {


        int ans = helperRecursion(coins,amount);

        return ans== Integer.MAX_VALUE? -1 : ans;

    }
    public static int helperRecursion(int[] coins, int amount) {

        if (amount == 0) return 0;

        if (amount < 0) return Integer.MAX_VALUE;

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {

            int ans = helperRecursion(coins, amount - coin);

            if ( ans!=Integer.MAX_VALUE) {
                min = Math.min(ans+1, min);
            }

        }
        return min;
    }

    public static int coinChangeTopDown(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp,-1);
        int ans = helperTopDown(coins,amount,dp);

        return ans== Integer.MAX_VALUE? -1 : ans;

    }

    public static int helperTopDown(int[] coins, int amount, int[] dp) {

        if (amount == 0) return 0;

        if (amount < 0) return Integer.MAX_VALUE;

        if (dp[amount]!=-1) return dp[amount];

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {

            int ans = helperTopDown(coins, amount - coin, dp);

            if (ans!=Integer.MAX_VALUE) {
                min = Math.min(min, ans+1);
            }
        }

        dp[amount] = min;

        return min;

    }

    public static int bottomUpApproach(int[] coins, int amount) {

        int[] dp = new int[amount + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] =0;

        for (int target =1 ; target<= amount ; target++) {
            int min = Integer.MAX_VALUE;
            for (int coin : coins) {

                if (target-coin>=0){

                    int ans = dp[target-coin];
                    if (ans!=Integer.MAX_VALUE) {
                        min = Math.min(min, ans+1);
                    }
                }
            }

            dp[target] = min;
        }

        return dp[amount];
    }
}
