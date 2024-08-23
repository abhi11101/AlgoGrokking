package com.CodeHelp.C5_RecursionAndBacktracking;

public class C3_MaximumNumber {

    public static void main(String[] args) {
        int[] arr = {2,3,4,56,76,12,87,21,34,48};
        System.out.println(findMax(arr,Integer.MIN_VALUE,0));

    }

    public static int findMax(int[] arr, int max, int index){

        if (index>=arr.length){
            return max;
        }

        max = Math.max(max, arr[index]);

        return findMax(arr, max, index+1);

    }

}
