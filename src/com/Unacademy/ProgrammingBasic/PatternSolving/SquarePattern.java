package com.Unacademy.ProgrammingBasic.PatternSolving;

public class SquarePattern {
    public static void main(String[] args) {
        square(4);
    }
    public static void square(int n){
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
