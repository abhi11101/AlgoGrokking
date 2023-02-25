package com.DSA.CharacterAndString.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters_3 {
    public static void main(String[] args) {
      //  System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(faster("dvdf"));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> track = new HashMap<>();
        int ans =0;
        int left=0,right=0;
        int n=s.length();
        while(right<n){
            char c = s.charAt(right);
            if (track.containsKey(c) && track.get(c)>=left){
                left=track.get(c)+1;
            }
            track.put(c,right);
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }

    private static int faster(String s){

        int ans =0;
        int left=0,right=0;
        int n=s.length();
        while(right<n){
            char c = s.charAt(right);
            int previousIndex = s.indexOf(c,left);
            if (previousIndex!=right){
                left=previousIndex+1;
            }
            ans = Math.max(ans,right-left+1);
            right++;
        }
        return ans;
    }
}
