package com.DSA.Recursion;

public class CountWaysToReachTheNStair {
    public static void main(String[] args) {
        System.out.println(find(3));
    }
    private static int find(int n){
        if (n<0)return 0;
        if (n==0)return 1;
        int ans = find(n-1) + find(n-2);
        return ans;
    }
}
