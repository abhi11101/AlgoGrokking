package com.CodeHelp.C5_RecursionAndBacktracking;

public class C9_CutIntoSegments {

    public static void main(String[] args) {

        System.out.println(cutSegment(7,5,2,2));
        System.out.println(cutSegment(10,5,2,2));
        System.out.println(cutSegment(11,2,3,5));
        System.out.println(cutSegment(7,2,5,5));
        System.out.println(cutSegment(8,3,3,3));
    }


    public static int cutSegment(int n , int x ,int y, int z){

        if (n==0){
            return 0;
        }
        if (n<0){
            return Integer.MIN_VALUE;
        }

        int xans = cutSegment(n-x,x,y,z) +1;
        int yans = cutSegment(n-y,x,z,y) +1;
        int zans = cutSegment(n-z,x,y,z) +1;

        int ans = Math.max(xans, Math.max(yans,zans));

        return ans;

    }

}
