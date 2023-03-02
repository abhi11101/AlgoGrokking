package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BeautifulArrangement_526 {
    public static void main(String[] args) {

        System.out.println("Size "+ countArrangement(3));
    }
    public static int countArrangement(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] nums = new int[n+1];
        for (int i =1;i<=n;i++){
            nums[i]=i;
        }
        for (int x : nums){
            System.out.print(x+ " ");
        }
        System.out.println();
        rec(1,nums,ans);
        show(ans);
        return ans.size();
    }

    public static void rec(int index, int[] nums, List<List<Integer>> ans){
        if (index==nums.length){
            List<Integer> curr = new ArrayList<>();
            for (int i=1;i<nums.length;i++){
                curr.add(nums[i]);
            }
            ans.add(curr);

        }
        for (int i=index;i<nums.length;i++){
            swap(nums,index,i);
            if (nums[index]%(index)==0 || (index)%nums[index]==0)rec(index+1,nums,ans);
            swap(nums,index,i);
        }

    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    private static void show(List<List<Integer>> ans ){
        for (List<Integer> l : ans){
            for (int x : l){
                System.out.print(x+ "");
            }
            System.out.println();
        }
    }
}
