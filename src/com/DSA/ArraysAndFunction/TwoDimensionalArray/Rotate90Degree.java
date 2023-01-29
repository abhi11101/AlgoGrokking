package com.DSA.ArraysAndFunction.TwoDimensionalArray;

public class Rotate90Degree {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int count =1;
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                arr[i][j] = count;
                count++;
            }
        }
        print(arr,4,4);
        rotate(arr,4,4);
        print(arr,4,4);
    }
   public static void rotate(int arr[][], int m, int n){
        transpose(arr,m,n);
        int j,k;
        int temp;
        for (int i=0;i<m;i++){
            k=0;
            j=n-1;
            while(k<j){
                temp=arr[i][k];
                arr[i][k]=arr[i][j];
                arr[i][j]=temp;
                k++;
                j--;
            }
        }
   }
    public static void transpose(int arr[][],int m,int n){
        int temp;
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i<j) { // Can also write in for loop as j<i
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }
    public static void print(int arr[][], int m , int n){
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
