package com.DSA.Recursion.LeetCode;

public class NQueensTwo_52 {
    static int count=0;
    public static void main(String[] args) {
        System.out.println(totalNQueens(1));
    }
    public static int totalNQueens(int n) {
        char[][] board= new char[n][n];
        rec(board,0);
        return count;
    }

    public static void rec(char[][] board, int col){
        if (col==board.length){
            count++;
            return;
        }
        for (int row =0;row<board.length;row++){
            if (isPossible(board,row,col)){
                board[row][col]='Q';
                rec(board,col+1);
                board[row][col]='.';
            }
        }
    }

    public static boolean isPossible(char[][] board, int row, int col){

        //Horizontal
        for (int i =0;i<board.length;i++){
            if (board[row][i]=='Q')return false;
        }

        //Vertical
        for (int i=0;i<board.length;i++){
            if (board[i][col]=='Q')return false;
        }

        //UpperLeft
        for (int c =col,r=row;c>=0 && r>=0;r--,c--){
            if (board[r][c]=='Q')return false;
        }

        //UpperRight
        for (int c =col,r=row;c<board.length &&r>=0;c++,r--){
            if (board[r][c]=='Q')return false;
        }

        //DownLeft
        for (int c =col,r=row;r<board.length&&c>=0;c--,r++){
            if (board[r][c]=='Q')return false;
        }

        //DownRight
        for (int c = col,r=row;r<board.length && c<board.length;r++,c++){
            if (board[r][c]=='Q')return false;
        }

        return true;
    }

}
