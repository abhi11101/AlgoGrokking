package com.CodeHelp.C1_Arrays;

public class C12_RowwiseSum {

    public static void main(String[] args) {

        int[][] data = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int row =0; row < data.length; row++) {

            int sum = 0;
            for (int col = 0; col < data[row].length; col++) {

                sum+=data[row][col];

            }
            System.out.println(sum);
        }


    }
}
