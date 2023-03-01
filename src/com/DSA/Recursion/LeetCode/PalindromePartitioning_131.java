package com.DSA.Recursion.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning_131 {
    public static void main(String[] args) {
        List<List<String>> ans = partition("aabb");
        showList(ans);
    }
    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        rec(s,0,ans,curr);
        return ans;
    }
    public static void rec(String s, int index, List<List<String>> ans, List<String> curr){
        if (index==s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for (int i=index;i<s.length();i++){
            if (isPalndrome(s,index,i)){
                curr.add(s.substring(index,i+1));
                rec(s,i+1,ans,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
    public static boolean isPalndrome(String s , int start, int end){
        while (start<=end){
            if (s.charAt(start)!=s.charAt(end))return false;
            start++;
            end--;
        }
        return true;
    }
    private static void showList(List<List<String>> ans){
        for (List<String> l : ans){
            for (String s : l){
                System.out.print(s+ " ");
            }
            System.out.println();
        }
    }
}
