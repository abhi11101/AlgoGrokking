package com.CodeHelp.Extra;

public class E2_Palindrome {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] nums = {1,2,3,2,1};
        printArray(arr);
        System.out.println(checkPalindrome(nums));
    }

    public static boolean checkPalindrome(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start< end){

            if (arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    private static void printArray(int[] arr) {

        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
