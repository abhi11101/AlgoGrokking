package com.DSA.Recursion.LeetCode;

public class SudokuSolver_37 {
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        solveSudoku(board);
        showBoard(board);
    }

    public static void solveSudoku(char[][] board) {
            solve(board);
    }

    public static boolean solve(char[][] board){
        for(int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j]=='.'){
                    for (char val ='1';val<='9';val++){
                        if (isPossible(i,j,board,val)){
                            board[i][j]=val;
                            boolean nextSol = solve(board);
                            if (nextSol)return true;
                            else {
                                board[i][j]='.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isPossible(int row, int col, char[][] board, char val){
        for (int i=0;i<9;i++){
            if (board[row][i]==val)return false;
            if (board[i][col]==val)return false;
            if (board[3*(row/3)+i/3][3*(col/3) + i%3]==val)return false;
        }
        return true;
    }
    private static void showBoard(char[][] board){
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
