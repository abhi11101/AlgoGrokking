package com.CodeHelp.Extra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class E57_ContainsDuplicate2_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {1,0,1,1};
        System.out.println(containsNearbyDuplicate(arr, 1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int diff = Math.abs(map.get(nums[i]) - i);
                if (diff <= k) {return true;}
                map.put(nums[i], i);

            }else {
                map.put(nums[i],i);
            }

        }
        System.out.println(map);
        return false;
    }


}
