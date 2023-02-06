package com.DSA.BinarySearch;

public class PainterPartition {
    public static void main(String[] args) {
        int[] boards = {10,20,30,40};
        find(boards,2);
    }
    public static void find(int[] boards, int P){
        int start=0;
        int end=0;
        for (int x : boards){
            end+=x;
        }
        int ans=-1;
        int mid;
        while (start<=end){
            mid=start+(end-start)/2;
            if (isPossible( boards, P, mid)){
                ans=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        System.out.println(ans);
    }
    public static boolean isPossible(int[] boards, int P, int mid){
        int count=1;
        int sum=0;
        for (int i=0;i<boards.length;i++){
            if (sum+boards[i]<=mid){
                sum+=boards[i];
            }
            else {
                count++;
                if (count>P || boards[i]>mid)return false;
                sum=boards[i];
            }
        }
        return true;
    }
}
