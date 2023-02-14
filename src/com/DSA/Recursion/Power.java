package com.DSA.Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(find(25,2));
    }

    private static int find(int n, int p){
        if (p==0)return 1;
        if (p==1)return n;
        int ans = find(n,p>>1);
        if ((p&1)==0)return ans*ans;
        else return n*ans*ans;
    }
}
