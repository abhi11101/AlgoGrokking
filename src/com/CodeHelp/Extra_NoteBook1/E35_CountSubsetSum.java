package com.CodeHelp.Extra_NoteBook1;

public class E35_CountSubsetSum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(countSubsetSum(arr,8));
    }

    public static int countSubsetSum(int[] arr, int sum) {

        return helper(arr, sum, 0);

    }

    public static int helper(int[] arr, int sum, int index) {

        if (index == arr.length || sum==0) {
            if (sum==0){
                return 1;
            }
            return 0;
        }

        int ans =0;
        ans+= helper(arr, sum-arr[index], index+1);

        ans+= helper(arr, sum, index+1);
        return ans;

    }

}
