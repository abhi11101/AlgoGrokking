package com.DSA.BinarySearch;

import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int[] stalls = {1, 2, 4, 8, 9};
        find(stalls,3);
    }
    public static void find(int[] stalls, int C){
        Arrays.sort(stalls);
        int max=stalls[0];
        int min=stalls[0];
        for (int x :stalls){
            if (x>max)max=x;
            if (x<min)min=x;
        }
        int start=0;
        int end=max-min;
        int mid;
        int ans=-1;
        while (start<=end){
            mid=start+(end-start)/2;
            if (isPossible(stalls,C,mid)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(ans);
    }

    public static boolean isPossible(int[] stalls,int C ,int mid){
        int count=1;
        int lastPos=stalls[0];
        for (int i=0;i<stalls.length;i++){
            if (stalls[i]-lastPos>=mid){
                count++;
                if (count==C)return true;
                lastPos=stalls[i];
            }
        }
        return false;
    }

}
