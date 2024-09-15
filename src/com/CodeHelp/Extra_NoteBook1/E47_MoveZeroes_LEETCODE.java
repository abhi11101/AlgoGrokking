package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/move-zeroes/description/
 */
public class E47_MoveZeroes_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        printArray(arr);
    }

    public static void moveZeroes(int[] nums) {

        int j =0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }

        }

    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

}
