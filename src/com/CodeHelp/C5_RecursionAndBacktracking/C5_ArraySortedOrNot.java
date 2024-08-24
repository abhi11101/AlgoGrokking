package com.CodeHelp.C5_RecursionAndBacktracking;

public class C5_ArraySortedOrNot {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {34,7,1,98,76,23,54,66};
        System.out.println(isSorted(arr,0));
        System.out.println(isSorted(arr2,0));

    }

    public static boolean isSorted(int[] arr, int index){

        if (index==arr.length-1){
            return true;
        }
        if (arr[index]>arr[index+1]){
            return false;
        }

        return isSorted(arr, index+1);

    }

}
