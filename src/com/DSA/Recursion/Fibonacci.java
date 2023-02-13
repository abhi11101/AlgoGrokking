package com.DSA.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(recursionMethod(9));
        System.out.println(fasterMethod(9));
    }


    private static int recursionMethod(int n){
        if (n==0 || n==1)return n;

        return recursionMethod(n-1)+recursionMethod(n-2);
    }

    private static int fasterMethod(int n){
        if (n==0 || n==1)return n;
        int prev1=1;
        int prev2=0;
        int sum=0;
        for (int i=2;i<=n;i++){
             sum =prev1+prev2;
            prev2=prev1;
            prev1=sum;
        }
        return sum;
    }
}
