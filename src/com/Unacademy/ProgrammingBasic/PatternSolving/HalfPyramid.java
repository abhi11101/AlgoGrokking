package com.Unacademy.ProgrammingBasic.PatternSolving;

public class HalfPyramid {
    public static void main(String[] args) {
        hPyr(3);
    }
    public static void hPyr(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
