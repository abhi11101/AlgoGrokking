package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 */
public class E39_RemoveDuplicatesFromSortedArray_LEETCODE {

    public static void main(String[] args) {

        int[] arr1 = {1,1,2};
        int[] arr2 = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr1));
        System.out.println(removeDuplicates(arr2));
    }

    public static int removeDuplicates(int[] nums) {

        int mainIndex =1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[i-1]) {
                nums[mainIndex] = nums[i];
                mainIndex++;

            }

        }
        return mainIndex;
    }

}
