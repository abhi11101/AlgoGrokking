package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/spiral-matrix-ii/description/
 */
public class E67_SpiralMatrix2_LEETCODE {

    public static void main(String[] args) {

        int[][] ans = generateMatrix(3);
        printMatrix(ans);

    }

    public static int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int startRow = 0;
        int endRow = n-1;
        int startCol =0;
        int endCol =n-1;
        int totalElements = n*n;
        int count =1;
        while(startRow<=endRow && startCol<=endCol && totalElements >0){

            //Left to right
            for(int i = startCol;i<=endCol && totalElements>0;i++){
                System.out.println("Left to Right count "+ count);
                matrix[startRow][i] = count;
                totalElements--;
                count++;
            }
            printMatrix(matrix);
            startRow++;

            //TopToBottom
            for(int i = startRow;i<=endRow && totalElements>0;i++){
                System.out.println("Top to Bottom count "+ count);
                matrix[i][endCol] = count;
                totalElements--;
                count++;
            }
            endCol--;
            printMatrix(matrix);

            //RightToLeft
            for(int i = endCol; i>=startCol && totalElements>0;i--){
                System.out.println("Right to Left count "+ count);
                matrix[endRow][i]=count;
                totalElements--;
                count++;
            }
            endRow--;
            printMatrix(matrix);
            //BottomToUp
            for(int i = endRow; i>=startRow && totalElements >0;i--){
                System.out.println("Bottom to Top count "+ count);
                System.out.println("");
                matrix[i][startCol] = count;
                totalElements--;
                count++;
            }
            startCol++;
            printMatrix(matrix);
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix){

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
