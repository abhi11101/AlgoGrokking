package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/first-letter-to-appear-twice/description/
 */
public class E71_FirstLetterToAppearTwice_LEETCODE {

    public static void main(String[] args) {

        System.out.println(repeatedCharacter("abccbaacz"));
        System.out.println(repeatedCharacter("abcdd"));

    }

    public static char repeatedCharacter(String s) {

        int[] freq = new int[26];

        for(char c : s.toCharArray()){

            if (freq[c - 'a'] == 1)return c;

            freq[c - 'a']++;

        }
        return ' ';
    }

}
