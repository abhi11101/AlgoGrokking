package com.DSA.BinarySearch;

public class EKO {
    public static void main(String[] args) {
        int arr[] = {56, 75, 89, 20, 99};
        find(arr,58);
    }
    public static void find(int arr[],int M){
        int end=0;
        for(int x: arr){
            if (x>end)end=x;
        }
        int start=0;
        int mid;
        int ans=-1;
        int sum=0;
        while (start<=end){
            mid=start+(end-start)/2;
            for(int i=0;i<arr.length;i++){
               int val= (arr[i]-mid) <0 ? 0 : arr[i]-mid;
                sum= sum + val;
            }
            if (sum==M){
                System.out.println(mid);
                break;
            }
            else if (sum<M)end=mid-1;
            else start=mid+1;
            sum=0;
        }
    }
}
