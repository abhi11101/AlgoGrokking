package com.CodeHelp.C15_DynamicProgramming;

/*
https://leetcode.com/problems/fibonacci-number/description/
 */
public class C1_FibonacciNumber_LEETCODE {

    public static void main(String[] args) {

        for (int i =0;i<=10;i++){
            System.out.print(fib(i) + " ");
        }
        System.out.println();

        for (int i =0;i<=10;i++){
            System.out.print(fib2(i) + " ");
        }
        System.out.println();

        for (int i =0;i<=10;i++){
            System.out.print(spaceOptimal(i) + " ");
        }
        System.out.println();
    }

    // Memoization
    public static int fib(int n) {

        if (n==0 || n==1)return n;

        int[] dp = new int[n+1];

        return topDownApproach(n,dp);
    }

    public static int topDownApproach(int n , int[] dp){

        if (n==0 || n==1)return n;
        if (dp[n]!=0)return dp[n];

        dp[n]= topDownApproach(n-1,dp)+ topDownApproach(n-2,dp);

        return dp[n];

    }

    // Tabulation
    public static int fib2(int n){

        if (n==0 || n==1)return n;

        int[] dp = new int[n+1];

        return bottomUpApproach(n,dp);
    }

    public static int bottomUpApproach(int n , int[] dp){

        if (n==0 || n==1)return n;

        dp[0]=0;
        dp[1]=1;

        for (int i=2;i<=n;i++){

            dp[i]=dp[i-1]+dp[i-2];

        }

        return dp[n];
    }

    public static int spaceOptimal(int n){

        if (n==0 || n==1)return n;

        int prev1 =0;
        int prev2 =1;
        int sum =0;
        for (int i=2;i<=n;i++){

            sum = prev1+prev2;
            prev1 = prev2;
            prev2 = sum;

        }

        return sum;
    }

}
