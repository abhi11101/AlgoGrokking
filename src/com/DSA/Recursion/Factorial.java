package com.DSA.Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 6 is " + fact(6));
    }

    private static int fact(int n){
        if (n==1)return 1;
        return n*(fact(n-1)); //Tail Recursion
    }
}
