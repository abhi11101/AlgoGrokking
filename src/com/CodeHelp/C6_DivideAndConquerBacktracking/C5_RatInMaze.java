package com.CodeHelp.C6_DivideAndConquerBacktracking;

import java.util.ArrayList;
import java.util.List;

public class C5_RatInMaze {

    public static void main(String[] args) {

        int[][] matrix = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};

        List<String> ans = findPath(matrix);
        printList(ans);

    }

    public static List<String> findPath(int[][] matrix){

        List<String> ans = new ArrayList<>();
        if (matrix[0][0]==0)return ans;
        boolean[][] visitedLog = new boolean[matrix.length][matrix[0].length];
        findHelper(matrix,matrix.length,0,0,ans,new StringBuilder(),visitedLog);
        return ans;
    }

    public static void findHelper(int[][] matrix, int n, int sourceX, int sourceY, List<String> ans,
                            StringBuilder path, boolean[][] visitedLog){

        if (sourceX==n-1 && sourceY==n-1){
            ans.add(path.toString());
            return;
        }

        visitedLog[sourceX][sourceY] = true;

        //Down

        int newX = sourceX+1;
        int newY = sourceY;

        if (isPossible(matrix,newX,newY,visitedLog)){

            path.append("D");
            findHelper(matrix,n,newX,newY,ans,path,visitedLog);
            path.deleteCharAt(path.length()-1);

        }

        // Left

        newX = sourceX;
        newY = sourceY-1;

        if (isPossible(matrix,newX,newY,visitedLog)){

            path.append("L");
            findHelper(matrix,n,newX,newY,ans,path,visitedLog);
            path.deleteCharAt(path.length()-1);
        }

        //Right
        newX = sourceX;
        newY = sourceY+1;
        if (isPossible(matrix,newX,newY,visitedLog)){
            path.append("R");
            findHelper(matrix,n,newX,newY,ans,path,visitedLog);
            path.deleteCharAt(path.length()-1);
        }

        //Up
        newX = sourceX-1;
        newY = sourceY;

        if (isPossible(matrix,newX,newY,visitedLog)){
            path.append("U");
            findHelper(matrix,n,newX,newY,ans,path,visitedLog);
            path.deleteCharAt(path.length()-1);
        }

        visitedLog[sourceX][sourceY] = false;

    }

    public static boolean isPossible(int[][] matrix, int newX, int newY, boolean[][] visitedLog){

        if (newX >= 0 && newX <matrix.length && newY >= 0 && newY <matrix.length
           && !visitedLog[newX][newY] && matrix[newX][newY]==1){
            return true;
        }
        return false;

    }

    private static void printList(List<String> list) {

        for (String x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }


}
