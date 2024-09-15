package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/merge-sorted-array/description/
 */
public class E36_MergeSortedArray_LEETCODE {

    public static void main(String[] args) {

        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};
        merge(num1,3,num2,3);
        printArray(num1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int num1Index = m-1;
        int num2Index = n-1;
        int mainIndex = m+n-1;


        while (num1Index >= 0 && num2Index >= 0) {

            if (nums1[num1Index] > nums2[num2Index]) {
                nums1[mainIndex] = nums1[num1Index];
                num1Index--;
            }
            else {
                nums1[mainIndex] = nums2[num2Index];
                num2Index--;
            }
            mainIndex--;

        }

        while (num1Index >= 0) {
            nums1[mainIndex] = nums1[num1Index];
            mainIndex--;
            num1Index--;
        }

        while (num2Index >= 0) {
            nums1[mainIndex] = nums2[num2Index];
            mainIndex--;
            num2Index--;
        }

    }

    public static void printArray(int[] nums) {

        for (int x : nums){
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
