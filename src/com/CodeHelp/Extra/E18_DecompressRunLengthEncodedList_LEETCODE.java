package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/decompress-run-length-encoded-list/description/
 */
public class E18_DecompressRunLengthEncodedList_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        decompressRLElist(arr);

    }

    public static int[] decompressRLElist(int[] nums) {

        int size =0;

        for (int i =0;i<nums.length;i+=2){
            size+=nums[i];
        }

        int[] ans = new int[size];

        int index =0;
        int freq =0;
        int val =0;

        for (int i =0;i<nums.length;i+=2){

            freq = nums[i];
            val = nums[i+1];

            while (freq>0){
                ans[index] = val;
                freq--;
                index++;
            }
        }
        printArray(ans);
        return ans;

    }

    private static void printArray(int[] arr) {

        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
