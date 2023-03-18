package com.DSA.Recursion.LeetCode;

public class Find_theWinner_ofTheCircularGame_1823 {
    public static void main(String[] args) {
        int n= 5, k=2;
        System.out.println(findTheWinner(n,k));
    }
    public static int findTheWinner(int n, int k) {
        if (n==1){
            return 1;
        }
        return (findTheWinner(n-1,k)+k-1)%n +1;
    }
}
