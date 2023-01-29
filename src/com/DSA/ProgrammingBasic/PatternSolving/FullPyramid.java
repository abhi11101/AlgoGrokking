package com.DSA.ProgrammingBasic.PatternSolving;

public class FullPyramid {
    public static void main(String[] args) {
        pyr(5);
    }
    public static void pyr(int n){
        for (int row =1;row<=n;row++){
            for (int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for (int star=row;star>0;star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
