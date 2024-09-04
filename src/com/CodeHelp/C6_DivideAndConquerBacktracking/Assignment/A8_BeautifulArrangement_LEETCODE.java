package com.CodeHelp.C6_DivideAndConquerBacktracking.Assignment;

/*
https://leetcode.com/problems/beautiful-arrangement/
 */
public class A8_BeautifulArrangement_LEETCODE {
    static int count =0;
    public static void main(String[] args) {

        System.out.println(countArrangement(3));

    }

    public static int countArrangement(int n) {

        int[] nums = new int[n+1];
        for (int i = 1; i<=n;i++){
            nums[i] = i;
        }
        helper(nums,1);
        return count;
    }

    public static void helper(int[] nums, int index){

        if (index == nums.length ){
            count++;
            printArray(nums);
        }

        for (int i =index;i<nums.length;i++){
            swap(nums,i,index);

            if (nums[index]%index==0 || index%nums[index]==0){
                helper(nums,index+1);
            }
            swap(nums,index,i);
        }
    }

    public static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    private static void printArray(int[] nums){

        for (int i=1;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }

}
