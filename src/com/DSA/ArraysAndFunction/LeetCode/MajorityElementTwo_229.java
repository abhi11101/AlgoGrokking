package com.DSA.ArraysAndFunction.LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementTwo_229 {
    public static void main(String[] args) {
        int[] nums = {6,5,5};
        List<Integer> ans = majorityElement(nums);
        List<Integer> fast = faster(nums);
        show(fast);
    }
    public static List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        int count = nums.length/3;
        for (int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()){
            if (m.getValue()>count){
                ans.add(m.getKey());
            }
        }
        return ans;
    }
    public static List<Integer> faster(int[] nums){
        List<Integer> ans = new ArrayList<>();
        int num1=-1,num2=-1,count1=0,count2=0;
        for (int x : nums){
            if (x==num1)count1++;
            else if (x==num2)count2++;
            else if (count1==0){
                num1=x;
                count1=1;
            }
            else if (count2==0){
                num2=x;
                count2=1;
            }
            else {
                count1--;
                count2--;
            }
        }
        int mainCount =nums.length/3;
        count1=0;
        count2=0;
        for (int x : nums){
            if (x==num1)count1++;
            else if (x==num2)count2++;
        }
        if (count1>mainCount)ans.add(num1);
        if (count2>mainCount)ans.add(num2);
        return ans;
    }
    private static void show(List<Integer> ans){
        for (int x : ans){
            System.out.println(x);
        }
    }
}
