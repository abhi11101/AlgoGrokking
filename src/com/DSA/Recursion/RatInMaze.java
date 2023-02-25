package com.DSA.Recursion;

import java.util.ArrayList;
import java.util.List;

public class RatInMaze {
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        int[][] m = {{1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}};
        int n =4;
        boolean[][] visitedLog = new boolean[n][n];
        find(m,n,ans,0,0,new StringBuilder(),visitedLog);
        show(ans);    }
    private static void find(int[][] m, int n, List<String> ans, int sourceX, int sourceY, StringBuilder path,
                             boolean[][] visitedLog){
            if (sourceX==n-1 && sourceY==n-1){
                ans.add(path.toString());
                return;
            }
            visitedLog[sourceX][sourceY]=true;

            //Down
            int newX = sourceX+1;
            int newY = sourceY;
            if (isPossible(m,n,newX,newY,visitedLog)){
                path.append("D");
                find(m,n,ans,newX,newY,path,visitedLog);
                path.deleteCharAt(path.length()-1);
            }

            //Left
            newX = sourceX;
            newY = sourceY-1;
            if (isPossible(m,n,newX,newY,visitedLog)){
            path.append("L");
            find(m,n,ans,newX,newY,path,visitedLog);
                path.deleteCharAt(path.length()-1);
            }

            //Right
            newX = sourceX;
        newY = sourceY+1;
        if (isPossible(m,n,newX,newY,visitedLog)){
            path.append("R");
            find(m,n,ans,newX,newY,path,visitedLog);
            path.deleteCharAt(path.length()-1);
        }
        //Up
        newX = sourceX-1;
        newY = sourceY;
        if (isPossible(m,n,newX,newY,visitedLog)){
            path.append("U");
            find(m,n,ans,newX,newY,path,visitedLog);
            path.deleteCharAt(path.length()-1);
        }

            visitedLog[sourceX][sourceY]=false;
    }

    private static boolean isPossible(int[][]m, int n, int sourceX, int sourceY, boolean[][] visitedLog){
        if(sourceX>=0 && sourceX<n && sourceY>=0 && sourceY<n && !visitedLog[sourceX][sourceY]
            && m[sourceX][sourceY]==1){
            return true;
        }
        else return false;
    }

    private static void show(List<String> list){
        for (String s : list){
            System.out.println(s);
        }
    }

}
