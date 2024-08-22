package com.CodeHelp.Extra;

import java.util.Arrays;
import java.util.Comparator;

/*
https://leetcode.com/problems/largest-number/description/
 */
public class E12_LargestNumber_LEETCODE {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,0};
        int[] nums2 = {3,30,34,5,9,0};
        System.out.println(largestNumber(nums));
        System.out.println(largestNumber(nums2));
        work();
    }

    public static String largestNumber(int[] nums) {

        String[] stringNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            stringNums[i] = String.valueOf(nums[i]);
        }

        Comparator<String> comparator = (s1, s2) -> (s2+s1).compareTo(s1+s2);

        Arrays.sort(stringNums ,comparator);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringNums.length; i++) {

            sb.append(stringNums[i]);

        }
        printArray(stringNums);
        return sb.charAt(0) =='0' ? "0" : sb.toString();
    }

    private static void printArray(String[] arr){

        for (String s : arr){
            System.out.print(s + " ");
        }
        System.out.println();

    }

    public static void work(){

        String[] test = { "Abhi", "Test","Work","Ball","Goat","Eat"};
        Integer[] data = {3,4,412,6,7,12,1,9,67,354};
        Comparator<String> comp = (s1, s2) -> s2.compareTo(s1);
        Comparator<Integer> comp2 = (s1, s2) -> s2.compareTo(s1);
        Arrays.sort(test,comp);
        Arrays.sort(data,comp2);
        printArray(test);

        for (int x : data) {
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.println(comp2.compare(1,10));
    }

}
