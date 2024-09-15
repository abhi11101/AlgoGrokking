package com.CodeHelp.Extra_NoteBook1;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/combination-sum-iii/description/
 */
public class E22_CombinationSum3_LEETCODE {

    public static void main(String[] args) {

        List<List<Integer>> ans = combinationSum3(3, 7);
        for (List<Integer> list : ans) {
            printList(list);
        }


    }

    public static List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> ans = new ArrayList<>();
        findSum(k,n,1,ans,new ArrayList<>());
        return ans;

    }

    public static void findSum(int k, int n, int index, List<List<Integer>> ans, List<Integer> list){

        if (list.size() == k){
            if (n==0){
                ans.add(new ArrayList<>(list));
            }
            return;

        }

        for (int i =index;i<=9;i++){

            if (i>n)break;
            list.add(i);
            findSum(k,n-i,i+1,ans,list);
            list.removeLast();

        }
    }
    private static void printList(List<Integer> list) {

        for (int x: list){
            System.out.print(x + " ");
        }
        System.out.println();

    }
}
