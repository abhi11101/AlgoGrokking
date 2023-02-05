package com.DSA.BinarySearch;

import java.util.Arrays;

public class RotiPrata {
    public static void main(String[] args) {
        int[] cook = {4,1, 2,3, 4};
        find(cook,10);
    }
    public static void find(int cook[],int P){
        int start=0;
        int min=Integer.MAX_VALUE;
        Arrays.sort(cook);
        int end = cook[0]*((P*(P+1))/2);
        int mid;
        int ans=-1;
        System.out.println("End " + end);
        while (start<=end){
            mid =start+(end-start)/2;
            System.out.println("Mid " + mid);
            if (isPossible(cook,mid,P)){
             ans=mid;
             end=mid-1;
             System.out.println("If ");
            }
            else start=mid+1;
            if (ans<min)min=ans;
            System.out.println("Ans " + ans);
        }
        System.out.println("Ans "+ ans + " min " + min);

    }
    public static boolean isPossible(int cook[],int mid ,int P){
        int time =0;
        int count=0;
        for (int i=0;i<cook.length;i++){
            time=cook[i];
            int j=2;
            while (time<=mid){
                count++;
                time=time + cook[i]*j;
            }
          //  System.out.println("Count "+ count);
            if (count>=P)return true;
        }
        return false;
    }

}
