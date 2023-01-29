package com.DSA.ProgrammingBasic.Basic3;

public class LeetCode_231 {
    public static void main(String[] args) {

        System.out.println(twoPower(8));
        System.out.println(betterSol(4));
    }

    public static boolean twoPower(int n){
        if (n<0)return false;
        int count =0;
        while (n>0){
            if ((n&1)==1)count++;
            n = n>>1;
        }
        if (count==1)return true;
        else return false;
    }
    public static boolean betterSol(int n){
        return n>0 && (n&(n-1))==0;
    }
}
