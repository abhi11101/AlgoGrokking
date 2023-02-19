package com.DSA.ArraysAndFunction.TwoDimensionalArray;

public class SpiralMatrixTwo {
    public static void main(String[] args) {
            work(1);
    }

    private static void work(int n){
        int[][] matrix = new int[n][n];
        int startRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=n-1;
        int val=1;
        while (startRow<=endRow && startCol<=endCol){
            for (int i=startCol;i<=endCol;i++){
                matrix[startRow][i]= val++;
            }
            startRow++;
            for (int i=startRow;i<=endRow;i++){
                matrix[i][endCol]=val++;
            }
            endCol--;
            if (startRow<=endRow){
                for (int i=endCol;i>=startCol;i--){
                    matrix[endRow][i]=val++;
                }
                endRow--;
            }
            if (startCol<=endCol){
                for (int i=endRow;i>=startRow;i--){
                    matrix[i][startCol]=val++;
                }
                startCol++;
            }
        }
        show(matrix,n);
    }
    private static void show(int[][] matrix, int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
