package com.Unacademy.ArraysAndFunction.TwoDimensionalArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int count =1;
        for (int i =0;i<4;i++){
            for (int j=0;j<4;j++){
                arr[i][j]=count;
                count++;
            }
        }
        task(arr,4,4);
    }

    public static void task(int arr[][], int m, int n){
        int startRow = 0;
        int startCol=0;
        int endRow = m-1;
        int endCol = n-1;

        while (startRow<=endRow){
         for (int i=startCol;i<=endCol;i++){
             System.out.print(arr[startRow][i] + " ");
         }
         startRow++;
      //      System.out.println("Start Row " + startRow);
         for (int i=startRow;i<=endRow;i++){
             System.out.print(arr[i][endCol] + " ");
         }
         endCol--;
   //         System.out.println("End Col " + endCol);
         for (int i=endCol;i>=startCol;i--){
             System.out.print(arr[endRow][i] + " ");
         }
         endRow--;
     //       System.out.println("End row " + endRow);

         for (int i=endRow;i>=startRow;i--){
             System.out.print(arr[i][startCol] + " ");
         }
         startCol++;
         //   System.out.println("Start Col " + startCol);
        }
    }
}
