package com.CodeHelp.C1_Arrays.Assignment;

public class A4_MissingElementFromDuplicates {

    public static void main(String[] args) {

        int[] data = {1,3,3,3,4};;

//        findMissingVisiting(data);
        sortedSwap(data);

    }

    public static void findMissingVisiting(int[] nums){

      int index = 0;

      while (index < nums.length){

          int visitIndex = Math.abs(nums[index])-1;
          if (nums[visitIndex]>0){
              nums[visitIndex] = -1*nums[visitIndex];
          }
          index++;
      }

      for (int i = 0; i < nums.length; i++){
          if (nums[i]>0){
              System.out.println(i+1);
          }
      }
    }


    public static void sortedSwap(int[] nums){

       int index = 0;

       while (index<nums.length){

           int visitIndex = nums[index]-1;
           if (nums[index]!=nums[visitIndex]){

               int temp = nums[visitIndex];
               nums[visitIndex] = nums[index];
               nums[index] = temp;

           }else {
               index++;
           }

       }
       for (int i = 0; i < nums.length; i++){

           if (nums[i]!=i+1){
               System.out.println(i+1);
           }

       }
       printArray(nums);

    }

    private static void printArray(int[] arr) {

        for (int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
