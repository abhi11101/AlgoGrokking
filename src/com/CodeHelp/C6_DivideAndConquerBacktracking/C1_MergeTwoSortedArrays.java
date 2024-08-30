package com.CodeHelp.C6_DivideAndConquerBacktracking;

public class C1_MergeTwoSortedArrays {

    public static void main(String[] args) {

        int[] num1 = {1,23,34,45,67};
        int[] num2 = {2,6,18,73,98};
        merge(num1, num2);
    }

    public static void merge(int[] nums1,int[] nums2) {

        int i =0;
        int j=0;
        int[] ansArray = new int[nums1.length+nums2.length];
        int mainIndex =0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                ansArray[mainIndex] = nums1[i];
                mainIndex++;
                i++;
            }else {
                ansArray[mainIndex] = nums2[j];
                mainIndex++;
                j++;
            }

        }

        if (i < nums1.length) {
            while (i<nums1.length) {
                ansArray[mainIndex] = nums1[i];
                mainIndex++;
                i++;
            }
        }
        if (j < nums2.length) {
            while (j<nums2.length) {
                ansArray[mainIndex] = nums2[j];
                mainIndex++;
                j++;
            }
        }
        printArray(ansArray);

    }

    private static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
