package com.DSA.ArraysAndFunction.OneDimensional;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr ={1,4,6,9,10,16,19};
        int[] b = {2,3,5,7,12,20};
        merge(arr,b);
    }

    private static void merge(int[] nums1, int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n+m];
        int i=0;
        int j=0;
        int index=0;
        while (i<n && j<m){
            if (nums1[i]<nums2[j]){
                ans[index++]=nums1[i++];
            }
            else{
                ans[index++]=nums2[j++];
            }
        }
        while (i<n){
            ans[index++]=nums1[i++];
        }
        while (j<m) {
            ans[index++] = nums2[j++];
        }
        show(ans);
    }
    private static void show(int[] ans){
        for (int x: ans){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
