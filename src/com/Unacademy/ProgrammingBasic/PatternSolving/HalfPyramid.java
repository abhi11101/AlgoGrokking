package com.Unacademy.ProgrammingBasic.PatternSolving;

public class HalfPyramid {
    public static void main(String[] args) {
    //    downwardHalfPyr(3);
    //    upwardHalfPyr(3);
     //   rightHalfPyramid(5);
        downwardRight(5);
    }
    public static void upwardHalfPyr(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void downwardHalfPyr(int n){
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    public static void rightHalfPyramid(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    public static void downwardRight(int n){
        for (int row = 1; row<=n ;row++){
            for (int col =1; col<row;col++){
                System.out.print(" ");
            }
            for (int star=n;star>=row;star--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
