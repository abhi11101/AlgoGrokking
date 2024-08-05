package com.CodeHelp.C1_Arrays.Assignment;

/*
https://leetcode.com/problems/spiral-matrix/description/
 */

public class A7_SpiralMatrix_LEETCODE {

    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] b = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[][] c = { {7},
                {9},
                {6}
        };

        int[][] d = {
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7},
                {8},
                {9},
                {10}
        };

        spiralMatrix(d);

    }

    public static void spiralMatrix(int[][] matrix) {

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;


        while (startRow<=endRow && startCol<=endCol){

            for (int i = startCol; i<=endCol;i++){
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;

            for (int i = startRow; i<=endRow;i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            if (startRow<=endRow){
            for (int i = endCol; i>=startCol;i--){
                System.out.print(matrix[endRow][i] + " ");
            }
            endRow--;
            }

            if (startCol<=endCol){
            for (int i = endRow; i>=startRow;i--){
                System.out.print(matrix[i][startCol] + " ");
            }
            startCol++;
            }

        }


    }

}
