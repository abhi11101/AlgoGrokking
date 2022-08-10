package com.Unacademy.ProgrammingBasic.PatternSolving;

public class DownwardFullPyramid {
    public static void main(String[] args) {
        pyr(5);
    }
    public static void pyr(int n){
        for (int row=1;row<=n;row++){
            for (int space=1;space<row;space++){
                System.out.print(" ");
            }
            for (int star=n;star>=row;star--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
