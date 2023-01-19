package com.Unacademy.ArraysAndFunction.TwoDimensionalArray;

public class ColumnWiseSum {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int count =1;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                arr[i][j]= count;
                count++;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sum(arr,3,3);
    }

    public static void sum(int[][] arr, int m, int n){
        int sum=0;
        int max =0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                sum += arr[j][i];
            }
            System.out.print(sum + " ");
            if (max<sum)max=sum;
            sum=0;
        }
        System.out.println("\nMax " + max);
    }
}
