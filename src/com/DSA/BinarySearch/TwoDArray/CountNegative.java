package com.DSA.BinarySearch.TwoDArray;

public class CountNegative {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        find(grid);
    }

    public static void find(int[][] grid){
        int m= grid.length;
        int n= grid[0].length;
        int row = 0;
        int col= n-1;
        int count =0;

        while(row<grid.length && col>=0){
            System.out.println("Row "+ row + " Col "+ col);
            System.out.println("Num "+ grid[row][col]);
            System.out.println("M "+ m + " N "+ n);
            if(grid[row][col]<0){
                count+=m;
                col--;
                System.out.println("Count "+ count);
            }
            else if(grid[row][col]>=0){
                row++;
                m--;
            }

        }
    }
}
