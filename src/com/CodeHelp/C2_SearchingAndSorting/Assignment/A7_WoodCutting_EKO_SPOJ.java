package com.CodeHelp.C2_SearchingAndSorting.Assignment;

public class A7_WoodCutting_EKO_SPOJ {

    public static void main(String[] args) {

        int[] trees = {20,15,10,17};
        int[] trees2 = {4,42,40,26,46};
        System.out.println(findHeight(trees2,20));

    }


    public static int findHeight(int[] trees, int woodLength){

        int start = 0;
        int end = 0;

        for (int x : trees) {
            if (x>end)end=x;
        }

        int sum =0;
        int mid;

        while (start<=end){

            mid = start+(end-start)/2;

            for (int tree : trees) {

                int val = tree-mid>0 ? tree-mid : 0;
                sum+=val;

            }

            if (sum==woodLength){
                return mid;
            } else if (sum<woodLength) {
                end = mid-1;
            }
            else{
                start = mid+1;
            }
            sum =0;
        }
        return -1;


    }

}
