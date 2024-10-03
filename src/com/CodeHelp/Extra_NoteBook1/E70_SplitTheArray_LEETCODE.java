package com.CodeHelp.Extra_NoteBook1;

import java.util.HashMap;

/*
https://leetcode.com/problems/split-the-array/
 */
public class E70_SplitTheArray_LEETCODE {

    public static void main(String[] args) {

        int[] nums1 = {1,1,2,2,3,4};
        System.out.println(isPossibleToSplit(nums1));

        int[] nums2 = {1,1,1,1};
        System.out.println(isPossibleToSplit(nums2));

    }

    public static boolean isPossibleToSplit(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {

            if (!map.containsKey(x)) {
                map.put(x, 1);
            }else{
                map.put(x, map.get(x) + 1);
            }
            if (map.get(x) > 2) {
                return false;
            }
        }

        return true;
    }
}
