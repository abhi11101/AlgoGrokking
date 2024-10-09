package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/single-element-in-a-sorted-array/description/
 */
public class E77_SingleElementInSortedArray_LEETCODE {

    public static void main(String[] args) {

        int[] nums1 = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums1));

        int[] nums2 = {3,3,7,7,10,11,11};
        System.out.println(singleNonDuplicate(nums2));

    }

    public static int singleNonDuplicate(int[] nums) {

        int start =0;
        int end = nums.length-1;
        int mid;

        while (start<end){

            mid = start+(end-start)/2;

            if(mid%2==0){

                if (nums[mid]==nums[mid+1]){
                    start = mid+2;
                }else{
                    end=mid;
                }

            }else{

                if (nums[mid]==nums[mid-1]){
                    start = mid+1;
                }else{
                    end=mid-1;
                }

            }

        }

        return nums[start];
    }

}
