package com.DSA.Recursion.LeetCode;

public class WordSearch_79 {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        System.out.println(exist(board,word));
    }

    public static boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
               //    if (rec(board,word,0,i,j,new boolean[row][col]))return true;
                   if (faster(board,word,0,i,j,row,col,new boolean[row][col]))return true;
            }
        }
        return false;
    }
    private static boolean rec(char[][] board, String word, int index, int sourceX,
                               int sourceY, boolean[][] tracker){
        if (sourceX<0 || sourceX>= board.length || sourceY<0 || sourceY>=board[0].length ||
                board[sourceX][sourceY]!=word.charAt(index) || tracker[sourceX][sourceY])return false;

        if (index>=word.length()-1)return true;

        tracker[sourceX][sourceY]=true;

        if(rec(board,word,index+1,sourceX,sourceY+1,tracker))return true;
        if(rec(board,word,index+1,sourceX,sourceY-1,tracker))return true;
        if(rec(board,word,index+1,sourceX-1,sourceY,tracker))return true;
        if (rec(board,word,index+1,sourceX+1,sourceY,tracker))return true;

        tracker[sourceX][sourceY]=false;

        return false;
    }

    private static boolean faster(char[][] board, String word, int index, int sourceX,
                                  int sourceY, int row, int col,boolean[][] tracker){
        if (index==word.length()-1)return true;

        tracker[sourceX][sourceY]=true;
        //Left
        if (sourceY>0 && !tracker[sourceX][sourceY-1] && board[sourceX][sourceY-1]==word.charAt(index+1)
                && faster(board,word,index+1,sourceX,sourceY-1,row,col,tracker))return true;

        //Right
        if (sourceY<col-1 && !tracker[sourceX][sourceY+1] && board[sourceX][sourceY+1]==word.charAt(index+1)
                && faster(board,word,index+1,sourceX,sourceY+1,row,col,tracker))return true;
        //Up
        if (sourceX>0 && !tracker[sourceX-1][sourceY] && board[sourceX-1][sourceY]==word.charAt(index+1)
                && faster(board,word,index+1,sourceX-1,sourceY,row,col,tracker))return true;
        //Down
        if (sourceX<row-1 && !tracker[sourceX+1][sourceY] && board[sourceX+1][sourceY]==word.charAt(index+1)
        && faster(board,word,index+1,sourceX+1,sourceY,row,col,tracker))return true;

        tracker[sourceX][sourceY]=false;
        return false;
    }
}
