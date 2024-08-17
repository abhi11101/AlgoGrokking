package com.CodeHelp.C2_SearchingAndSorting.Assignment;

public class A5_PainterPartition {

    public static void main(String[] args) {

        int[] boards = {10, 10, 10, 10};
        int[] boards2 = {10, 20, 30, 40};
        System.out.println(partitionPainter(boards2,2));
    }


    public static int partitionPainter(int[] boards, int painters){

        int start = 0;
        int end = 0;
        int mid;
        int ans =-1;

        if (painters>boards.length)return ans;

        for (int board: boards) {
            end+=board;
        }

        while (start<=end){

            mid = start+(end-start)/2;

            if (isPossible(boards,painters, boards.length,mid)){
                ans = mid;
                end = mid-1;
            }
            else {
                start = mid+1;
            }

        }


        return ans;

    }


    public static boolean isPossible(int[] boards, int painters, int noOfBoards, int mid){

        int sum=0;
        int noOfPainter =1;

        for (int i=0;i<noOfBoards;i++){

            if (boards[i]+sum<=mid){
                sum+=boards[i];
            }
            else {
                noOfPainter++;
                if (noOfPainter>painters || boards[i]>mid){
                    return false;
                }
                sum= boards[i];
            }
        }

        return true;

    }

}
