package com.CodeHelp.C5_RecursionAndBacktracking.Assignment;

/*
https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/
 */
public class A13_NumberOfDiceRollsWithTargetSum_LEETCODE {

    public static void main(String[] args) {

        System.out.println(numRollsToTarget(1,6,3));
        System.out.println(numRollsToTarget(2,6,7));
    }

    public static int numRollsToTarget(int n, int k, int target) {


        if (target<0)return 0;
        if (target==0 && n==0)return 1;
        if (n==0 && target!=0)return 0;
        if (n!=0 && target==0)return 0;

        int ans =0;
        for (int i =1; i<=k;i++){
            ans = ans + numRollsToTarget(n-1,k,target-i);
        }

        return ans;
    }

}
