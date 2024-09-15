package com.CodeHelp.Extra_NoteBook1;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/subsets/description/
 */
public class E26_Subsets_LEETCODE {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans  = subsets(nums);
        for (List<Integer> list : ans) {
            printList(list);
        }

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        helper(nums,0,curr,ans);

        return ans;
    }

    public static void helper(int[] arr, int index, List<Integer> curr, List<List<Integer>> ans){

        if (index == arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(arr[index]);
        helper(arr, index + 1, curr,ans);
        curr.removeLast();
        helper(arr, index + 1, curr, ans);

    }

    private static void printList(List<Integer> list) {

        for (int x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }

}
