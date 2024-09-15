package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/length-of-last-word/description/
 */
public class E54_LengthOfLastWord_LEETCODE {

    public static void main(String[] args) {

        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {

        char[] charArray = s.toCharArray();

        int index =charArray.length-1;
        while(index>=0 && charArray[index]==' '){
            index--;
        }
        int end = index;
        while(index>=0 && charArray[index] != ' '){
            index--;
        }

        return end-index;
    }

}
