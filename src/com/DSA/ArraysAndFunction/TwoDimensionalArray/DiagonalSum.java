package com.DSA.ArraysAndFunction.TwoDimensionalArray;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        work(arr);
    }

    public static void work(int[][] arr){
        int row=arr.length;
        int sum=0;
        for (int i=0;i<row;i++){
            sum+=arr[i][i];
        }
        System.out.println(sum);
    }
}
