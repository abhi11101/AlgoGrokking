package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
 */
public class E53_RemoveDuplicatesFromSortedArray2_LEETCODE {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));

        int[] arr2 = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(arr2));

    }

    public static int removeDuplicates(int[] nums) {

        int count =1;

        int prevIndex=0;
        int mainIndex =0;

        while (prevIndex < nums.length) {

            int newCharIndex = prevIndex+1;

            while (newCharIndex < nums.length && nums[newCharIndex] == nums[prevIndex]) {

                count++;
                newCharIndex++;

            }
            nums[mainIndex] = nums[prevIndex];
            mainIndex++;
            if(count>1){
                nums[mainIndex] = nums[prevIndex];
                mainIndex++;
            }
            prevIndex = newCharIndex;
            count=1;
        }

        return mainIndex;
    }

}
