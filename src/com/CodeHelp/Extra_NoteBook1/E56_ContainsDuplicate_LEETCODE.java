package com.CodeHelp.Extra_NoteBook1;

import java.util.HashSet;
import java.util.Set;

/*
https://leetcode.com/problems/contains-duplicate/description/
 */
public class E56_ContainsDuplicate_LEETCODE {

    public static void main(String[] args) {

        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int x : nums){
            if(set.contains(x))return true;
            set.add(x);
        }
        return false;
    }


}
