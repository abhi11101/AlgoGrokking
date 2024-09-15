package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/third-maximum-number/
 */
public class E46_ThirdMaximumNumber_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {3,2,1};
        System.out.println(thirdMax(arr));

        int[] arr2 = {1,2};
        System.out.println(thirdMax(arr2));

        int[] arr3 = {2,2,3,1};
        System.out.println(thirdMax(arr3));

        int[] arr4 = {5,2,2};
        System.out.println(thirdMax(arr4));

        int[] arr5 = {1,2,-2147483648};
        System.out.println(thirdMax(arr5));

    }

    public static int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;


        for(int x : nums){

            if (x>max){
                System.out.println("Max " + x);
                thirdMax=secondMax;
                secondMax=max;
                max=x;
            }
            else if(x>secondMax && x<max){
                System.out.println("Second max " + x);
                thirdMax=secondMax;
                secondMax=x;
            }
            else if(x>thirdMax && x < secondMax){
                System.out.println("Third max " + x);
                thirdMax=x;
            }
        }
        return (int) (thirdMax==Long.MIN_VALUE ? max : thirdMax);
    }

}
