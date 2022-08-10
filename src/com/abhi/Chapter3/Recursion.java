package com.abhi.Chapter3;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(0));
    }
    public static int fact(int n){
        if (n==0)return 1;
        else return n*fact(n-1);
    }
}
