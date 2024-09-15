package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class E37_MedianOfTwoSortedArrays_LEETCODE {

    public static void main(String[] args) {

        int[] num1 = {1,3};
        int[] num2 = {2};
        System.out.println(findMedianSortedArrays(num1, num2));

        int[] num3 = {1,2};
        int[] num4 = {3,4};
        System.out.println(findMedianSortedArrays(num3, num4));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int num1Index =0;
        int num2Index =0;
        int[] mergedArray = new int[nums1.length + nums2.length];
        int mainIndex = 0;

        while (num1Index < nums1.length && num2Index < nums2.length) {
            if (nums1[num1Index] < nums2[num2Index]) {
                mergedArray[mainIndex] = nums1[num1Index];
                num1Index++;
            }
            else {
                mergedArray[mainIndex] = nums2[num2Index];
                num2Index++;
            }
            mainIndex++;
        }
        while (num1Index < nums1.length) {
            mergedArray[mainIndex] = nums1[num1Index];
            num1Index++;
            mainIndex++;
        }
        while (num2Index < nums2.length) {
            mergedArray[mainIndex] = nums2[num2Index];
            num2Index++;
            mainIndex++;
        }

        return mergedArray.length%2==0 ?
                ((double)(mergedArray[mergedArray.length/2] + mergedArray[(mergedArray.length/2) -1])/2)
                : (double)(mergedArray[mergedArray.length/2]);
    }

}
