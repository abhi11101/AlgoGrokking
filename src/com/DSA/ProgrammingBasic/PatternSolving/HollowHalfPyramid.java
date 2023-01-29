package com.DSA.ProgrammingBasic.PatternSolving;

public class HollowHalfPyramid {
    public static void main(String[] args) {
          //  pyr(6);
            second(6);
    }
    public static void pyr(int n){
        for (int row=1; row<=n;row++){
            System.out.print("*");
            for (int space=row;space<=n-2;space++){
                if (row==1) System.out.print("*");
                else {
                    System.out.print("A");
                }
            }
            if (row==n)break;
            System.out.println("*");
        }
    }
    public static void second(int n){
        for (int row=1;row<=n;row++){
            if (row==1 || row==n){
                for (int col =1; col<=n-row+1;col++){
                    System.out.print("*");
                }
            }else {
                System.out.print("*");
                for (int col=1;col<=n-row-1;col++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
