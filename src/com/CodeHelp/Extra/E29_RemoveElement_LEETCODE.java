package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/remove-element/description/
 */
public class E29_RemoveElement_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {3,2,2,3};
        int[] arr2 = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(arr,3));
        System.out.println(removeElement(arr2,2));

    }

    public static int removeElement(int[] nums, int val) {

      int validPos = -1;
      int index =0;
      while (index < nums.length) {

          if (nums[index] != val) {
              validPos++;
              nums[validPos] = nums[index];
          }
          index++;

      }
      return validPos+1;
    }

    public static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

}
