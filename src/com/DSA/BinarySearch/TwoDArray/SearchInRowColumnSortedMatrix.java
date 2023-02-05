package com.DSA.BinarySearch.TwoDArray;

public class SearchInRowColumnSortedMatrix {
    public static void main(String[] args) {
        int[][] arr= {{1,2},{3,4},{5,6},{7,8}};
        search(arr,5);
    }
    public static void search(int arr[][], int target){
        int row = arr.length;
        int col=arr[0].length;
        int i=0;
        int j=col-1;
        while (i<row && j>=0){
            if (arr[i][j]==target){
                System.out.println("I "+ i + " J "+j) ;
                break;
            } else if (arr[i][j]>target)j--;
            else i++;
        }

    }
}
