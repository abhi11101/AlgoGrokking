package com.DSA.Recursion;

public class Counting {
    public static void main(String[] args) {
        countFind(5);
    }

    private static void countFind(int n){
        if (n==0){
            return ;
        }
        countFind(n-1); //Head Recursion
        System.out.println(n);
    }
}
