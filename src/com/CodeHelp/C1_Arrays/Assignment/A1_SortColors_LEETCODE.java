package com.CodeHelp.C1_Arrays.Assignment;

/*
https://leetcode.com/problems/sort-colors/description/
 */

public class A1_SortColors_LEETCODE {

    public static void main(String[] args) {

        int[] data = {0,1,2,1,1,1,2,0,2,0,1,2,0,0,1,2,1,0,2,1};
        printArray(data);
//        sortArray(data);
        inPlace(data);
    }

    private static void sortArray(int[] nums) {

        int one =0;
        int two =0;
        int zero =0;

        for (int num : nums){
            if (num == 0){
                zero++;
            }
            else if (num == 1){
                one++;
            }
            else{
                two++;
            }
        }
        int index =0;
        while (zero>0){
            nums[index++] = 0;
            zero--;
        }
        while (one>0){
            nums[index++] = 1;
            one--;
        }
        while (two>0){
            nums[index++] = 2;
            two--;
        }

        printArray(nums);

    }

    private static void inPlace(int[] nums) {

        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        while (mid<=end){

            if (nums[mid]==0){
                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;
                mid++;
                start++;
            } else if (nums[mid]==1) {
                mid++;
            }else{
                int temp = nums[end];
                nums[end] = nums[mid];
                nums[mid] = temp;
                end--;
            }

        }
        printArray(nums);

    }

    private static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
