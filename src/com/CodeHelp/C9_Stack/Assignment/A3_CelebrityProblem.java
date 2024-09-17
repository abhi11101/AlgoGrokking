package com.CodeHelp.C9_Stack.Assignment;

import java.util.Stack;

public class A3_CelebrityProblem {

    public static void main(String[] args) {


        int[][] matrix = {
                {0, 1, 0},
                {0, 0, 0},
                {0, 1, 0}};

        System.out.println(isCelebrity(matrix));
    }

    public static int isCelebrity(int[][] matrix) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < matrix.length; i++) {
            stack.push(i);
        }

        while (stack.size()!=1){

            int A = stack.pop();
            int B = stack.pop();

            if (matrix[A][B]==1){
                stack.push(B);
            }else if (matrix[B][A]==1){
                stack.push(A);
            }
        }

        int celebrity = stack.pop();

        if (!rowCheck(matrix,celebrity))return -1;
        if (!colCheck(matrix,celebrity))return -1;

        return celebrity;
    }

    public static boolean rowCheck(int[][] matrix, int celebrity) {

        for (int i = 0; i < matrix.length; i++) {

            if (matrix[celebrity][i]!=0)return false;

        }
        return true;

    }

    public static boolean colCheck(int[][] matrix, int celebrity) {

        for (int i = 0; i < matrix.length; i++) {

            if (matrix[i][celebrity]!=1 && i!=celebrity)return false;
        }

        return true;

    }

}
