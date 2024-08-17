package com.CodeHelp.C2_SearchingAndSorting.Assignment;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/find-k-closest-elements/description/
 */
public class A2_FindKClosestElements_LEETCODE {


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] arr2 = {3,5,8,10};
        System.out.println(twoPointerMethod(arr,4,-1));
    }



    public static List<Integer> twoPointerMethod(int[] arr, int k, int x) {

        int low =0;
        int high = arr.length-1;

        while (high-low >=k){

            if (x-arr[low]> arr[high]-x){
                low++;
            }
            else {
                high--;
            }

        }

        List<Integer> res = new ArrayList<>();
        for (int i =low; i<=high;i++){
            res.add(arr[i]);
        }
        return res;

    }


}
