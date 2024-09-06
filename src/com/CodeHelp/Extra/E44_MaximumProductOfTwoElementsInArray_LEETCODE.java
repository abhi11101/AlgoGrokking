package com.CodeHelp.Extra;

/*
https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
 */
public class E44_MaximumProductOfTwoElementsInArray_LEETCODE {

    public static void main(String[] args) {

        int[] arr ={3,4,5,2};
        System.out.println(maxProduct(arr));
    }

    public static int maxProduct(int[] nums) {

        int max = 0;
        int secondMax =0;

        for (int x : nums){

            if (x>max){
                secondMax = max;
                max = x;
            }
            else if (x>secondMax){
                secondMax = x;
            }

        }
        System.out.println("Max " + max  + " " + secondMax);
        return (max-1)*(secondMax-1);
    }

}
