package com.DSA.Recursion.LeetCode;

public class MedianOfTwoSortedArrays_4 {
    public static void main(String[] args) {
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length+ nums2.length];
        double n= ans.length;
        merge(nums1,nums2,ans);
        if ((n%2)==0){
            double res = (double) (ans[(int)n/2] + ans[(int)(n/2)-1])/2;
            return res;
        }else{
            return ans[(int)n/2];
        }
    }
    private static void merge(int[] nums1, int[] nums2, int ans[]){
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i=0;
        int j=0;
        int index=0;
        while (i<len1 && j<len2){
            if (nums1[i]<nums2[j]){
                ans[index++]=nums1[i++];
            }else {
                ans[index++]=nums2[j++];
            }
        }
        while (i<len1){
            ans[index++]=nums1[i++];
        }
        while (j<len2){
            ans[index++]=nums2[j++];
        }
    }
}
