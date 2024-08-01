package com.CodeHelp.C1_Arrays;

import java.sql.SQLOutput;

public class C11_TwoD_Print {

    public static void main(String[] args) {

        int[][] data = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i =0; i< data.length;i++){
            for (int j =0; j< data[i].length; j++){

                System.out.print(data[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("========================");
        int[][] nums = {{1,2},{3,4},{5,6}};

        for (int row = 0; row < nums.length; row++){
            for (int col = 0; col < nums[row].length; col++){

                System.out.print(nums[row][col] + " ");

            }
            System.out.println();
        }


        System.out.println("=================");

        for (int col = 0 ;col < nums[0].length;col++){
            for (int row = 0; row < nums.length; row++){

                System.out.print(nums[row][col] + " ");

            }
            System.out.println();
        }

    }

}
