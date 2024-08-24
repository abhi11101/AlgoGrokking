package com.CodeHelp.C5_RecursionAndBacktracking;

public class C10_MaximumSumOfNonAdjacentElements {

    public static void main(String[] args) {


        int[] arr1 = {1,2,4};
        int[] arr2 = {2,1,4,9};
        int[] arr3 = {1,2,3,5,4};
        int[] arr4 = {1,2,3,1,3,5,8,1,9};
        System.out.println(find(arr1,0,0,0));
        System.out.println(find(arr2,0,0,0));
        System.out.println(find(arr3,0,0,0));
        System.out.println(find(arr4,0,0,0));
    }

    public static int find(int[] arr, int index, int sum, int max){

        if (index >= arr.length){
            return sum;
        }

        int ansInclude = find(arr,index+2, sum+arr[index], max);

        int ansExclude = find(arr,index+1, sum, max);

        max = Math.max(max,Math.max(ansInclude,ansExclude));

        return max;

    }

}
