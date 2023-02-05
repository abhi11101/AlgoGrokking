package com.DSA.BinarySearch.TwoDArray;

public class SearchRowWiseSorted {
    public static void main(String[] args) {
        int[][] arr= {{1,2},{3,4},{5,6},{7,8}};
       // search(arr,2,1,1);
        binary(arr,7);
    }
    public static void search(int arr[][] ,int target, int row,int col){
        int ans=-1;

        for (int i=0;i<row;i++){
            if (arr[i][col-1]>=target){
                ans=i;
           //     System.out.println("IF");
                break;
            }
        }
        if (ans>-1){
            for (int i=0;i<col;i++){
                if (arr[ans][i]==target){
                    System.out.println("["+ans+"]["+i+"]");
                    break;
                }
            }
        }else System.out.println(ans);

    }

    public static void binary(int arr[][], int target){
        int row = arr.length;
        int col = arr[0].length;
        int start=0,end=row-1,mid,ans=-1;
        while (start<=end){
            mid=start+(end-start)/2;
            System.out.println("mid " + mid);
            if(arr[mid][col-1]==target) {
                System.out.println("Target found " + mid + " " + (col-1));
                break;
            }
            else if (arr[mid][col-1]>=target){
                ans=mid;
                end=mid-1;
            }
            else {
                start=mid+1;
                System.out.println("Else start " + start);
            }
        }
        System.out.println("ans "+ ans);
        start=0;end=col-1;
        while (start<=end){
            mid=start + (end-start)/2;
            if (arr[ans][mid]==target){
                System.out.println("target found " + ans + " " + mid);
                break;
            }else if (arr[ans][mid]>target)end=mid-1;
            else start=mid+1;
        }
    }
}
