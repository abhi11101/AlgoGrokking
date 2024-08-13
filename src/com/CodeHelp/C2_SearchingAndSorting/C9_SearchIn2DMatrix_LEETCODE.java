package com.CodeHelp.C2_SearchingAndSorting;

/*
https://leetcode.com/problems/search-a-2d-matrix/description/
 */

public class C9_SearchIn2DMatrix_LEETCODE {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};

        System.out.println(searchMatrix(matrix,60));


    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row-1;
        int mid=0;
        int ans =-1;

        while (start <= end) {

            mid = start + (end - start)/2;

            if (matrix[mid][col-1]==target){
                System.out.println("Position is [" + mid + "][" + (col-1) + "]" );
                return true;
            }
            else if(matrix[mid][col-1]>target){
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }
        System.out.println("ans is " + ans);
        if (ans>-1){

            start =0;
            end = col-1;

            while (start <= end){

                mid = start + (end - start)/2;

                if (matrix[ans][mid]==target){
                    System.out.println("Position is [" + ans + "][" + mid + "]" );
                    return true;
                }
                else if (matrix[ans][mid]>target){
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
        }

        return false;
    }

}
