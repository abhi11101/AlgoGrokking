package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/is-subsequence/description/
 */
public class E32_IsSubsequence_LEETCODE {

    public static void main(String[] args) {

        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));

    }

    public static boolean isSubsequence(String s, String t) {

        int sIndex = 0;
        int tIndex = 0;
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        while (sIndex < sArray.length && tIndex < tArray.length) {

            if (sArray[sIndex] == tArray[tIndex]) {
                sIndex++;
            }
            tIndex++;

        }
        return sIndex == sArray.length;
    }

}
