package com.CodeHelp.C6_DivideAndConquerBacktracking;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/n-queens/description/
 */
public class C6_N_Queens_LEETCODE {

    public static void main(String[] args) {

        List<List<String>> ans = solveNQueens(4);
        for (List<String> list : ans) {
            printList(list);
        }

    }

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];

        solve(board,ans,0);

        return ans;

    }

    public static  void solve(char[][] board, List<List<String>> ans, int col) {

        if (col==board.length) {
            saveBoard(board,ans);
            return;
        }

        for (int row = 0; row < board.length; row++) {

            if (isPossible(row,col,board)){
                board[row][col] = 'Q';
                solve(board,ans,col+1);
                board[row][col] = '.';
            }
        }

    }

    public static boolean isPossible(int row, int col, char[][] board) {

        //Horizontal

        for (int i=0;i<board.length;i++){
            if (board[row][i] == 'Q'){
                return false;
            }
        }

        // Vertical

        for (int i=0;i<board.length;i++){
            if (board[i][col] == 'Q'){
                return false;
            }
        }

        // Upper Left

        for (int i = row, j =col; i>=0 && j>=0;i--,j--){

            if (board[i][j] == 'Q'){
                return false;
            }

        }

        // Upper Right
        for (int i =row,j=col; i>=0 && j<board.length;i--,j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        // Lower Left

        for (int i =row,j=col;i<board.length &&j>=0;i++,j--){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        // Lower Right

        for (int i =row,j=col;i<board.length && j<board.length;i++,j++){
            if (board[i][j] == 'Q'){
                return false;
            }
        }

        return true;

    }

    public static void saveBoard(char[][] board, List<List<String>> ans){

        List<String> curr = new ArrayList<>();
        for (int row = 0; row < board.length; row++) {
            StringBuilder sb = new StringBuilder();

            for (int col = 0; col < board.length; col++) {
                if (board[row][col] == 'Q'){
                   sb.append('Q');
                }
                else{
                    sb.append(".");
                }
            }
            curr.add(sb.toString());
        }

        ans.add(curr);
    }

    private static void printList(List<String> list) {

        for (String x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
