package com.CodeHelp.C5_RecursionAndBacktracking;

public class C8_MinimumElementsForSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(find(arr,11));

    }


    public static int find(int[] arr, int target){

        if (target==0){
            return 0;
        }
        if (target<0){
            return Integer.MAX_VALUE;
        }
        int mini = Integer.MAX_VALUE;
        for (int i =0;i<arr.length;i++){

            int ans = find(arr,target-arr[i]);

            if (ans!=Integer.MAX_VALUE){
                mini = Math.min(mini,ans+1);
            }

        }

        return mini;

    }

}
