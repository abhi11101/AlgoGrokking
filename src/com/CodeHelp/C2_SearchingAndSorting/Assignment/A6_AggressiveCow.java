package com.CodeHelp.C2_SearchingAndSorting.Assignment;

public class A6_AggressiveCow {

    public static void main(String[] args) {

        int[] stalls = {1,2,4,8,9};
        int[] stalls2 = {1,2,5,7,10};
        System.out.println(findSpace(stalls,3));
        System.out.println(findSpace(stalls2,3));
    }

    public static int findSpace(int[] stalls, int cows){

        int start =0;
        int end =0;
        int min=0;
        int max =0;
        int ans =-1;
        int mid;
        for (int x : stalls){
            if (x>max)max=x;
            if (x<min)min=x;
        }
        end = max-min;

        while (start<=end){

            mid = start+(end-start)/2;

            if (isPossible(stalls,cows, stalls.length, mid)){

                ans = mid;
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }


        return ans;
    }

    public static boolean isPossible(int[] stalls, int cows, int noOfStalls, int mid){

        int noOfCows = 1;
        int lastPos = stalls[0];
        for (int i=1;i<noOfStalls;i++){

            if (stalls[i]-lastPos >=mid){

                noOfCows++;
                if (noOfCows==cows)return true;
                lastPos = stalls[i];

            }

        }
        return false;

    }

}
