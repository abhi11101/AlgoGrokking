package com.DSA.Recursion.LeetCode;

import java.util.HashSet;


public class LetterTilePossibilities_1079 {
    public static void main(String[] args) {
       HashSet<String> ans = new HashSet<>();
       String s = "AAABBC";
//        rec(s,ans,new StringBuilder(),new boolean[s.length()]);
//        showList(ans);
//        System.out.println(ans.size());
        System.out.println(faster(s));

    }
    public int numTilePossibilities(String tiles) {
        HashSet<String> ans = new HashSet<>();
        String s = "AAABBC";
        rec(s,ans,new StringBuilder(),new boolean[s.length()]);
        showList(ans);
       return ans.size();
    }
    private static int faster(String tiles){
        int[] freq = new int[26];
        for (char c : tiles.toCharArray()){
            freq[c-'A']++;
        }
        return helper(freq);
    }
    private static int helper(int[] freq){
        int count =0;
        for (int i=0;i<26;i++){
            if (freq[i]==0)continue;
            freq[i]--;
            count++;
            count+=helper(freq);
            freq[i]++;
        }
        return count;
    }
    public static void rec(String tiles,  HashSet<String> ans, StringBuilder output, boolean[] track){
//        if (!output.isEmpty()){  // Can also add like this
//            ans.add(output.toString());
//        }
        if (output.length()==tiles.length())return;
        for (int i=0;i<tiles.length();i++){
            if (!track[i]){
                track[i]=true;
            char c = tiles.charAt(i);
            output.append(c);
                    ans.add(output.toString());
            rec(tiles,ans,output,track);
            track[i]=false;
            output.deleteCharAt(output.length()-1);}
        }

    }
    private static void showList(HashSet<String> ans){
        for (String s : ans){
            System.out.println(s);
        }
    }
}
