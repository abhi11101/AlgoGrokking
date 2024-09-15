package com.CodeHelp.Extra_NoteBook1;

/*
https://leetcode.com/problems/split-a-string-in-balanced-strings/description/
 */
public class E19_SplitAStringInBalancedStrings_LEETCODE {

    public static void main(String[] args) {

        System.out.println(balancedStringSplit("RLRRLLRLRL"));
        System.out.println(balancedStringSplit("RLRRRLLRLL"));
        System.out.println(balancedStringSplit("LLLLRRRR"));

    }

    public static int balancedStringSplit(String s) {

        int Rcount =0;
        int count =0 ;

        for (int i = 0; i < s.length(); i++) {

           if (s.charAt(i) == 'R') {
               Rcount++;
           }
           else {
               Rcount--;
           }
           if (Rcount == 0){
               count++;
           }

        }

        return count;

    }


}
