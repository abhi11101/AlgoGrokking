package com.CodeHelp.C5_RecursionAndBacktracking;

public class C2_PrintAllDigit {

    public static void main(String[] args) {

        System.out.println(23/10);
        printAllDigit(54321);
        System.out.println();
        printAllDigit(0);
    }


    public static void printAllDigit(int n) {

        if (n<10){
            System.out.print(n + " ");
            return;
        }
        printAllDigit(n/10);
        System.out.print(n%10 +" ");

    }

}
