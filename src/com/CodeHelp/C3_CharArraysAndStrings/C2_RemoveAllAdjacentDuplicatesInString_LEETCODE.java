package com.CodeHelp.C3_CharArraysAndStrings;

import java.util.Stack;

/*
https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
 */
public class C2_RemoveAllAdjacentDuplicatesInString_LEETCODE {

    public static void main(String[] args) {

        String s = "abbaca";
        String s2 = "azxxzy";
        String s3 = "aaaaaaaa";
        System.out.println(removeDuplicates(s));

        System.out.println(twoPointer(s2));
        System.out.println(fastestWay(s));


    }

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (!stack.isEmpty()){

                if (stack.peek() == s.charAt(i)){
                    stack.pop();
                }
                else {
                   stack.push(s.charAt(i));
                }

            }else {
                stack.push(s.charAt(i));
            }

        }
        String res = "";
        for (int i =0 ;i<stack.size();i++){

            res+=stack.get(i);
        }
        return res;
    }

    public static String twoPointer(String s) {

        int i =0;
        int j =1;

        while ( j<s.length()){

            if (s.charAt(i)==s.charAt(j)){

                s = s.substring(0,i) + s.substring(j+1);
                if (i>0)i = i-1;
                j= i+1;

            }
            else {
                i++;
                j++;
            }


        }

        return s;
    }

    public static String fastestWay(String s) {
        char[] chars = new char[s.length()];

        int lastIndex = -1;

        for (char c : s.toCharArray()) {

            if (lastIndex==-1 || chars[lastIndex] != c){

              chars[lastIndex+1] = c;
              lastIndex++;


            }else {
                lastIndex--;
            }


        }

        return new String(chars,0,lastIndex+1);

    }

}
