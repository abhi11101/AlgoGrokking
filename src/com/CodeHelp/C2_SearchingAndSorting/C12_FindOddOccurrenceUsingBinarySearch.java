package com.CodeHelp.C2_SearchingAndSorting;

public class C12_FindOddOccurrenceUsingBinarySearch {

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,3,4,4,3,600,600,4,4,};
        int[] data = {5,4,4};
        int[] num2 = {1, 1, 2, 2, 3, 3, 4, 4, 5};
        System.out.println(search(num2));

    }

    public static int search(int[] nums){

        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            if (start==end)break;

            mid = start + (end - start) / 2;

            if (mid%2==0){

                if (nums[mid]==nums[mid+1]){
                    start=mid+2;
                }else {
                    end=mid;
                }

            }else {

                if (nums[mid]==nums[mid-1]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }


        }
        return nums[start];
    }

}
