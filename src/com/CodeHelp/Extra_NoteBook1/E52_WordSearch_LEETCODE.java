package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/word-search/description/
 */
public class E52_WordSearch_LEETCODE {

    public static void main(String[] args) {

        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};
        System.out.println(exist(board,"ABCCED"));
    }

    public static boolean exist(char[][] board, String word) {

        boolean[][] visited = new boolean[board.length][board[0].length];

        int rowLen = board.length;
        int colLen = board[0].length;

        for (int row =0; row < rowLen; row++) {

            for (int col = 0; col < colLen; col++) {
                if (board[row][col] == word.charAt(0)) {
                    if (isPossible(board,word,row,col,rowLen,colLen,0,visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isPossible(char[][] board, String word, int sourceX, int sourceY, int row, int col ,int wordIndex, boolean[][] visited) {

        if (wordIndex==word.length()-1) {
            return true;
        }

        visited[sourceX][sourceY] = true;

        //Left
        if (sourceY>0 && board[sourceX][sourceY-1]==word.charAt(wordIndex+1) && !visited[sourceX][sourceY-1] &&
            isPossible(board,word,sourceX,sourceY-1,row,col,wordIndex+1,visited))return true;

        //Right
        if (sourceY<col-1 && board[sourceX][sourceY+1]==word.charAt(wordIndex+1) && !visited[sourceX][sourceY+1] &&
           isPossible(board,word,sourceX,sourceY+1,row,col,wordIndex+1,visited))return true;

        //Top
        if (sourceX>0 && board[sourceX-1][sourceY]==word.charAt(wordIndex+1) && !visited[sourceX-1][sourceY] &&
           isPossible(board,word,sourceX-1,sourceY,row,col,wordIndex+1,visited))return true;

        //Down
        if (sourceX<row-1 && board[sourceX+1][sourceY]==word.charAt(wordIndex+1) && !visited[sourceX+1][sourceY] &&
          isPossible(board,word,sourceX+1,sourceY,row,col,wordIndex+1,visited))return true;

        visited[sourceX][sourceY] = false;

        return false;
    }

}
