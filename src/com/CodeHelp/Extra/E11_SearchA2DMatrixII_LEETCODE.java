package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 */
public class E11_SearchA2DMatrixII_LEETCODE {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,4,7,11,15},
                {2,5,8,12,19},
                {3,6,9,16,22},
                {10,13,14,17,24},
                {18,21,23,26,30}};
        int target = 5;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int i =0;
        int j = matrix[0].length-1;

        while (i < matrix.length && j >= 0) {

            if (matrix[i][j] == target) {
                return true;
            }
            else if (matrix[i][j] > target) {
                j--;
            }
            else {
                i++;
            }
        }
        return false;
    }

}
