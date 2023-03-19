package com.DSA.Recursion.LeetCode;

public class EliminationGame_390 {
    public static void main(String[] args) {
        System.out.println(lastRemaining(9));
    }
    public static int lastRemaining(int n) {
        if(n==1)return 1;
        return 2*(n/2 + 1 - lastRemaining(n/2));
    }
}
