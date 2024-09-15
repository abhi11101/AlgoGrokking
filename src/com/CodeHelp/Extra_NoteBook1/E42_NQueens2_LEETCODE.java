package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/n-queens-ii/description/
 */
public class E42_NQueens2_LEETCODE {

    static int count = 0;
    public static void main(String[] args) {

        System.out.println(totalNQueens(4));
    }

    public static int totalNQueens(int n) {

        char[][] board = new char[n][n];

         helper(board,0);

         return count;

    }

    private static void helper(char[][] board, int col) {

        if (col == board.length) {
            count++;
            return ;
        }

        for (int row = 0; row < board.length; row++) {

            if (isPossible(board,row,col)){
                board[row][col] = 'Q';
                helper(board,col+1);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isPossible(char[][] board, int row, int col) {

        //Horizontal

        for (int i =0;i<board.length;i++){

            if (board[row][i]=='Q')return false;

        }

        //Vertical

        for (int i =0;i<board.length;i++){

            if (board[i][col]=='Q')return false;
        }

        //UpperLeft

        for (int i=row,j=col; i>=0 && j>=0;i--,j--){
            if (board[i][j]=='Q')return false;
        }

        //UpperRight

        for (int i=row,j=col;i>=0 && j<board.length;i--,j++){
            if (board[i][j]=='Q')return false;
        }

        //LowerLeft

        for (int i=row,j=col;i<board.length && j>=0;i++,j--){
            if (board[i][j]=='Q')return false;
        }

        //LowerRight
        for (int i=row,j=col;i< board.length && j< board.length;i++,j++){
            if (board[i][j]=='Q')return false;
        }

        return true;

    }


}
