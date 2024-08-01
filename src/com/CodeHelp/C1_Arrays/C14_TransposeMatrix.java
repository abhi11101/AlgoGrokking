package com.CodeHelp.C1_Arrays;

public class C14_TransposeMatrix {

    public static void main(String[] args) {

        int[][] data = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] nums = {{1,2},{3,4},{5,6}};

        transposeSquareMatrix(data);
        transposeNonSquareMatrix(nums);

    }

    private static void transposeSquareMatrix(int[][] data) {
        printMatrix(data);
        System.out.println("============");
        for (int row = 0 ; row < data.length ; row++) {

            for (int col = row+1 ; col < data[row].length ; col++) {

//                if (row<col){ // instead of this col = row+1
                    int temp = data[row][col];
                    data[row][col] = data[col][row];
                    data[col][row] = temp;
//                }

            }
        }
        printMatrix(data);
        System.out.println("================");
    }

    public static void transposeNonSquareMatrix(int[][] data) {

        printMatrix(data);
        System.out.println("============");
        int row = data.length;
        int col = data[0].length;
        int[][] transposedMatrix = new int[col][row];

        for (int rowindex = 0 ; rowindex < row ; rowindex++) {

            for (int colindex = 0 ; colindex < col ; colindex++) {

                transposedMatrix[colindex][rowindex] = data[rowindex][colindex];

            }

        }

        printMatrix(transposedMatrix);

    }

    private static void printMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

    }

}
