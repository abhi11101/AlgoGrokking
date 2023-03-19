package com.DSA.ArraysAndFunction.LeetCode;

public class SpiralMatrix_54 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int count =1;
       int ma[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
       int n[][] = {{22,3,21,2}};
        for (int i =0;i<4;i++){
            for (int j=0;j<4;j++){
                arr[i][j]=count;
                count++;
            }
        }
        task(ma,ma.length,ma[0].length);
    }

    public static void task(int matrix[][], int m, int n){
        int startRow = 0;
        int startCol=0;
        int endRow = m-1;
        int endCol = n-1;

        while (startRow<=endRow && startCol<=endCol) {
            for (int i = startCol; i <=endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;
      //     System.out.println("Start Row " + startRow);
            for (int i = startRow; i <=endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;
      //      System.out.println("End Col " + endCol);
            if (startRow <=endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
                endRow--;
            }
         //   System.out.println("End row " + endRow);
            if (startCol<=endCol){
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            //    System.out.println("Start Col " + startCol);
            }
        }
    }
}
