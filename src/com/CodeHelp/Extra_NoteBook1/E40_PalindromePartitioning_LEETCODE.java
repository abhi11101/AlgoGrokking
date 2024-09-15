package com.CodeHelp.Extra_NoteBook1;

import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/palindrome-partitioning/description/
 */
public class E40_PalindromePartitioning_LEETCODE {

    public static void main(String[] args) {
        List<List<String>> ans = partition("aabb");
        for (List<String> list : ans) {
            printList(list);
        }

    }

    public static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        partitionHelper(0, s, list, new ArrayList<>());
        return list;
    }

    public static void partitionHelper(int partitionStart, String s, List<List<String>> list, List<String> temp) {

        if (partitionStart == s.length()) {
            list.add(new ArrayList<>(temp));
            return;
        }

        for (int partitionEnd = partitionStart; partitionEnd < s.length(); partitionEnd++) {

            if (isPalindrome(s,partitionStart,partitionEnd)){
                temp.add(s.substring(partitionStart,partitionEnd+1));
                partitionHelper(partitionEnd+1,s,list,temp);
                temp.removeLast();
            }

        }


    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private static void printList(List<String> list){

        for (String x : list){
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
