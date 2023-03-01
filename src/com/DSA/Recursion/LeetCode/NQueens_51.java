package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class NQueens_51 {
    public static void main(String[] args) {
        List<List<String>> ans =solveNQueens(4);
        showList(ans);
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        rec(board,allBoards,0);
        return allBoards;
    }
    public static void rec(char[][] board, List<List<String>> allBoards, int col){
        if (col==board.length){
            store(board,allBoards);
            return;
        }
        for (int row=0;row<board.length;row++){
                if (isPossible(row, col, board)){
                    board[row][col]='Q';
                    rec(board,allBoards,col+1);
                    board[row][col]= '.';
                }
        }
    }
    public static boolean isPossible(int row, int col, char[][] board){

        //Horizontal
        for (int j=0;j<board.length;j++){
            if (board[row][j]=='Q')return false;
        }

        //Vertical
        for (int j=0;j<board.length;j++){
            if (board[j][col]=='Q')return false;
        }

        //Upper Left
        for (int c=col,r =row;c>=0 && r>=0;c--,r--){
            if (board[r][c]=='Q')return false;
        }

        //Upper Right
        for (int c = col,r=row;c<board.length && r>=0;c++,r--){
            if (board[r][c]=='Q')return false;
        }

        //Down Left
        for (int c=col,r=row;r<board.length&& c>=0;r++,c--){
            if (board[r][c]=='Q')return false;
        }

        //Down Right
        for (int c=col,r=row;r<board.length && c<board.length;r++,c++){
            if (board[r][c]=='Q')return false;
        }

        return true;
    }

    public static void store(char[][] board, List<List<String>> allBoards){
        String res ="";
        List<String> curr = new ArrayList<>();
        for (int i=0;i<board.length;i++){
            res="";
            for (int j=0;j<board.length;j++){
                if (board[i][j]=='Q'){
                    res+='Q';
                }else{
                    res+='.';
                }
            }
            curr.add(res);
        }
        allBoards.add(curr);
    }

    private static void showList(List<List<String>> ans){
        for (List<String> l : ans){
            for (String s : l){
                System.out.print(s);
            }
            System.out.println();
        }
    }
}
