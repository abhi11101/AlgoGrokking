package com.CodeHelp.C1_Arrays.Assignment;

public class A8_WaveMatrix {

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

        waveMatrix(b);
    }

    public static void waveMatrix(int[][] matrix){

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol=0;
        int endCol = matrix[0].length - 1;


        while (startRow<=endRow){

            for (int i = startCol ;i<=endCol;i++){
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;
            if (startRow<=endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(matrix[startRow][i] + " ");
                }
                startRow++;
            }
        }


    }


}
