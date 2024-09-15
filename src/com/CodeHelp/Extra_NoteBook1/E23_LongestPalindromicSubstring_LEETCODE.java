package com.CodeHelp.Extra_NoteBook1;

public class E23_LongestPalindromicSubstring_LEETCODE {

    public static void main(String[] args) {

        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
    }

    public static String longestPalindrome(String s) {

        StringBuilder ans = new StringBuilder();
        for(int i =0;i<s.length();i++){

            expand(s,i,i,ans);
            expand(s,i,i+1,ans);
        }
        return ans.toString();

    }

    public static void expand(String s, int left, int right,StringBuilder ans) {

        int len;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            len = right-left+1;
            if (len > ans.length()){
                ans.setLength(0);
                ans.append(s.substring(left,right+1));
            }
            left--;
            right++;
        }
    }

}
