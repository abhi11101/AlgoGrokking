package com.Unacademy.ArraysAndFunction.TwoDimensionalArray;

public class WaveMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[5][5];
        int count =1;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                arr[i][j]= count;
                count++;
            }
        }
        task(arr,5,5);
    }

    public static void task(int arr[][], int m , int n){
        int Row = 0;
        int startCol =0;
        int endCol = n-1;

        while(Row<m){
           for (int i=startCol;i<=endCol;i++){
               System.out.print(arr[Row][i] + " ");
           }
           Row++;
            if (Row<m)
            {
            for (int i=endCol;i>=startCol;i--){
               System.out.print(arr[Row][i] + " ");
           }
            Row++;
            }
        }
    }
}
