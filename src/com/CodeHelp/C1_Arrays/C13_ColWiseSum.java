package com.CodeHelp.C1_Arrays;

public class C13_ColWiseSum {

    public static void main(String[] args) {

        int[][] data = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int col =0;col < data[0].length; col++) {
            int sum=0;
            for (int row = 0; row < data.length; row++) {

                sum += data[row][col];


            }
            System.out.println(sum);
        }


    }

}
