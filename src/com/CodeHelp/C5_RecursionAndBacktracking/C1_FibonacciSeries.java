package com.CodeHelp.C5_RecursionAndBacktracking;

public class C1_FibonacciSeries {

    public static void main(String[] args) {

        for (int i =0;i<=10;i++){
            System.out.print(fib(i) + " ");
        }
    }

    public static int fib(int n) {

        if (n<=1){
            return n;
        }

        return fib(n-1)+fib(n-2);


    }

}
