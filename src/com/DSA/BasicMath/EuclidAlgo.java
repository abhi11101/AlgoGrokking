package com.DSA.BasicMath;

public class EuclidAlgo {
    public static void main(String[] args) {
        System.out.println(GCD(12,10));
    }

    public static int GCD(int a, int b){
        if (a==0)return b;
        if (b==0)return a;
        while (a!=b){
            if (a>b)a-=b;
            else b-=a;
        }
        return a;
    }
}
