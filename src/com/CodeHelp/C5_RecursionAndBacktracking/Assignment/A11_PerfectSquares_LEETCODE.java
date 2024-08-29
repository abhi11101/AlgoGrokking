package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

/*
https://leetcode.com/problems/perfect-squares/description/
 */
public class A11_PerfectSquares_LEETCODE {

    public static void main(String[] args) {

        System.out.println(numSquares(12));
        System.out.println(numSquares(13));
        System.out.println(numSquares(16));

    }

    public static int numSquares(int n) {

        return helper(n);

    }

    public static int helper(int n){

        if (n==0)return 0;
        if (n<0) return 0;

        int i =1;
        int end = (int) Math.sqrt(n);
        int min = Integer.MAX_VALUE;
        while (i<=end){
        int perfectSquare = i*i;

        int ans = 1 + helper(n-perfectSquare);

        min = Math.min(min, ans);
        i++;
        }

        return min;

    }


}
